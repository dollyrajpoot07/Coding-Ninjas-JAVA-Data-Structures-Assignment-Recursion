// Multiplication (Recursive)
// Given two integers M & N, calculate and return their multiplication using recursion. You can only use subtraction and addition for your calculation. No other operators are allowed.
// Input format :
// Line 1 : Integer M
// Line 2 : Integer N
// Output format :
// M x N
// Constraints :
// 0 <= M <= 1000
// 0 <= N <= 1000
// Sample Input 1 :
// 3 
// 5
// Sample Output 1 :
// 15
// Sample Input 2 :
// 4 
// 0
// Sample Output 2 :
// 0
// CODE:

import java.util.*;

public class MultiplicationRecursiveWay {
    public static int multiplyTwoIntegers(int m, int n){
        if(m==0||n==0) {
            return 0;
        }
        if(m==1) {
            return n;
        }
        int fi = multiplyTwoIntegers(m - 1, n);
        int ans = fi + n;
        return ans;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int res = multiplyTwoIntegers(num1, num2);
        System.out.println(res);
        sc.close();
    }
}