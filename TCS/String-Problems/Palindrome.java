/*
Problem: Check Palindrome String

Description:
Given a string, check whether it is a palindrome or not.
A palindrome is a string that reads the same forward and backward.

Input:
A string str

Output:
Return true if the string is a palindrome, otherwise return false.

Example:
Input: racecar
Output: true

Input: hello
Output: false

Approach:
- Compare characters from the beginning and end of the string
- If any characters do not match, return false
- Traverse only up to half of the string for efficiency

Time Complexity: O(n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

public class Palindrome {
    public static void main(String[] args){
        String str = "racecar";
        boolean result = isPalindrome(str);

        System.out.println("Is the string a Palindrome? " + result);
    }

    // Method to checks if the input string is a palindrome
    public static boolean isPalindrome(String str) {
        int length = str.length();

        for(int i = 0; i < length / 2; i++) {
            if(str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}