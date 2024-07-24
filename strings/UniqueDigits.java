package strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class UniqueDigits {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        first.add(20);
        List<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(10);

        list.add(first);
        list.add(second);
        System.out.println(list);

        countUniqueDigits(list);



    }

    private static  void countUniqueDigits(List<List<Integer>> arr) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i <arr.size(); i++) {
            int count = 0;
            List<Integer> range = arr.get(i);
            int start = range.get(0);
            int end = range.get(1);
            for (int num = start; num <= end; num++) {
                if(isUniqueDigit(num)) {
                    count++;
                }
            }
            resultList.add(count);
        }
        System.out.println(resultList);
    }

    private static boolean isUniqueDigit(int num) {
        HashSet<Integer> hashSet = new HashSet<>();
        while( num > 0 ){
            int mod = num % 10;
            if(hashSet.contains(mod)) {
                return false;
            } else {
                hashSet.add(mod);
            }
            num = num/10;
        }
        return true;
    }
}
