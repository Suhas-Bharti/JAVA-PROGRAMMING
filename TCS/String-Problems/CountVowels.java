/*
Problem: Count Vowels in a String

Description:
Given a string, count the number of vowels (a, e, i, o, u) present in it.

Input:
A string str

Output:
Number of vowels in the string

Example:
Input: Implementation
Output: 5

Approach:
- Traverse the string
- Check each character if it is a vowel
- Increment count accordingly

Time Complexity: O(n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

public class CountVowels {
    public static void main(String[] args) {
        String str = "Implementation";
        int result = countVowels(str);

        System.out.println("Total number of vowels: " + result);
    }

    // Method to count vowels in a given string
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        int length = str.length();

        for(int i=0; i<length; i++) {
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}