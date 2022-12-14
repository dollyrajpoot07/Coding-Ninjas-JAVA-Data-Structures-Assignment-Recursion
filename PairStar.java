// Pair Star
// Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
// Input format :
// String S
// Output format :
// Modified string
// Constraints :
// 0 <= |S| <= 1000
// where |S| represents length of string S.
// Sample Input 1 :
// hello
// Sample Output 1:
// hel*lo
// Sample Input 2 :
// aaaa
// Sample Output 2 :
// a*a*a*a
// CODE:

import java.util.*;

public class PairStar {
    public static String addStars(String s) {
        if(s.length() == 1) {
            return s;
        }
        String small = addStars(s.substring(1));
        if(small.charAt(0) == s.charAt(0)) {
            return s.charAt(0) + "*" + small;
        }
        return s.charAt(0) + small;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = addStars(str);
        System.out.println(res);
        sc.close();
    }
}