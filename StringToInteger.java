// String to Integer
// Write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.
// Input format :
// Numeric string S (string, Eg. "1234")
// Output format :
// Corresponding integer N (int, Eg. 1234)
// Constraints :
// 0 <= |S| <= 9
// where |S| represents length of string S.
// Sample Input 1 :
// 00001231
// Sample Output 1 :
// 1231
// Sample Input 2 :
// 12567
// Sample Output 2 :
// 12567
// CODE:

import java.util.*;

public class StringToInteger {
    public static int convertStringToInt(String input){
        if(input.length() == 0) {
            return 0;
        }
        int ans = 0;
        if(input.charAt(0) == 0) {
            convertStringToInt(input.substring(1));
        } else {
            ans = Integer.parseInt(input);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int res = convertStringToInt(num);
        System.out.println(res);
        sc.close();
    }
}