// Check Palindrome (recursive)
// Check whether a given String S is a palindrome using recursion. Return true or false.
// Input Format :
// String S
// Output Format :
// 'true' or 'false'
// Constraints :
// 0 <= |S| <= 1000
// where |S| represents length of string S.
// Sample Input 1 :
// racecar
// Sample Output 1:
// true
// Sample Input 2 :
// ninja
// Sample Output 2:
// false
// CODE:


import java.util.*;

public class StringPalindrome {
    public static boolean isStringPalindrome(String input) {
        if(input.length() <= 1) {
    return true;
}
        if(input.charAt(0) == input.charAt(input.length() - 1)) {
                return isStringPalindrome(input.substring(1, input.length() - 1));
        } else {
                return false;
        }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean res = isStringPalindrome(str);
        System.out.println(res);
    }
}