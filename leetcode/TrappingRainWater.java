package leetcode;

public class TrappingRainWater {

    private static int maxWaterBruteForce(int[] arr, int n) {

        int result = 0 ;

        for(int i = 1 ; i < n-1 ; i++) {
            int left = arr[i];
            for(int j = 0 ; j < i ; j++) {
                left = Math.max(left, arr[j]);

            }
            System.out.println();
            int right = arr[i];
            for(int j = i+1 ; j < n ; j++) {
                right = Math.max(right, arr[j]);
               
            }

            result = result + Math.min(left, right) - arr[i];
            System.out.println("Result = " + result);
            System.out.println();
        }
        return result;


    }

    private static int maxWaterPreCalculation(int[] arr, int n) {
        //create a leftArray and rightArray
        int[] left = new int[n];
        int[] right = new int[n];
        int water = 0;
        left[0] = 0;
        for(int i = 1 ; i < n ; i++) {
            left[i] = Math.max(left[i-1], arr[i] );


        }
        System.out.println();
        right[n-1] = arr[n-1];
        for(int i = n-2 ; i >= 0 ; i-- ) {
            right[i] = Math.max(arr[i], right[i+1]);

        }

        for(int i = 0 ; i < n ; i++ ) {
            water = water + (Math.min(left[i], right[i]) - arr[i]);
        }
        return water;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int n = arr.length;

        //System.out.println(maxWaterBruteForce(arr,n));
        System.out.println(maxWaterPreCalculation(arr,n));
    }



}
