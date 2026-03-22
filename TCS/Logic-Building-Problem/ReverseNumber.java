/*
Problem: Reverse a Number

Description:
Given an integer n, reverse its digits and return the reversed number.

Input:
An integer n

Output:
An integer representing the reversed number

Example:
Input: 1234
Output: 4321

Approach:
- Extract the last digit using modulus operator (n % 10)
- Multiply the current reversed number by 10 and add the extracted digit
- Remove the last digit from the original number using division (n / 10)
- Repeat until the number becomes 0

Time Complexity: O(d)  // d = number of digits
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.*;

public class ReverseNumber {

    public static void main(String[] args) {
        int num = 1234;

        int result = reverseNumber(num);
        System.out.println("Reverse number is: " + result);
    }

    // Method to reverse a number
    public static int reverseNumber(int num) {
        int rev = 0;

        while(num != 0) {
            // Extract last digit
            int digit = num % 10;

            // Shift previous digits left and add new digit
            rev = rev * 10 + digit;

            // Remove last digit from number
            num = num / 10;
        }

        return rev;
    }
}
