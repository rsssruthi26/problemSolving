package strings;
/*
* Given a string s without spaces, a character ch and an integer count. Your task is to return the substring that remains after the character ch has appeared count number of times.
Note:  Assume upper case and lower case alphabets are different. “ ”(Empty string) should be returned if it is not possible, or the remaining substring is empty.

Examples:

Input: s = "Thisisdemostring", ch = 'i', count = 3
Output: ng
Explanation: The remaining substring of s after the 3rd
occurrence of 'i' is "ng", hence the output is ng.
* */

public class RemainingString {
    public static void main(String[] args) {
        String input = "Thisisdemostring";
        char ch = 'i';
        int count = 3;
        String result = printRemainingString(input,ch,count);
        System.out.println(result);
    }

    private static String printRemainingString(String input, char ch, int count) {
        if(input.indexOf(ch) == -1 )
            return "";
        int index = -1;
        for(int i = 1 ; i <= count ; i++ ) {
            index = input.indexOf(ch,index+1);
            if(index == -1) {
                return "";
            }

        }
        return input.substring(index+1);
    }
}
