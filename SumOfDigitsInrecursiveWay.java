// Sum of digits (recursive)
// Write a recursive function that returns the sum of the digits of a given integer.
// Input format :
// Integer N
// Output format :
// Sum of digits of N
// Constraints :
// 0 <= N <= 10^9
// Sample Input 1 :
// 12345
// Sample Output 1 :
// 15
// Sample Input 2 :
// 9
// Sample Output 2 :
// 9
// CODE:

import java.util.*;

public class SumOfDigitsInrecursiveWay {
    public static int sumOfDigits(int input) {
        if(input / 10 == 0) {
            return input;
        }
        int sum = sumOfDigits(input / 10);
        int ans = sum + (input % 10);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = sumOfDigits(num);
        System.out.println(res);
        sc.close();
    }
}