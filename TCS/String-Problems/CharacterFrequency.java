/*
Problem: Character Frequency in a String

Description:
Given a string, find the frequency of each character.

Input:
A string str

Output:
Print each character along with its frequency

Example:
Input: abbaabbc
Output:
a -> 3
b -> 4
c -> 1

Approach:
- Use an array of size 256 to store frequency (ASCII values)
- Traverse the string and increment count for each character
- Print characters with frequency > 0

Time Complexity: O(n)
Space Complexity: O(1)  // since array size is fixed (256)

Author: Suhas Bharti
*/

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "abbaabbc";
        countFrequency(str);
    }

    // Method to prints frequency of each character in the given string
    public static void countFrequency(String str) {

        if(str == null || str.length() == 0) {
            return;
        }

        int[] freq = new int[256]; // ASCII array

        // Count frequency
        for(int i=0; i<str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Print frequency
        for(int i=0; i<256; i++){
            if(freq[i] > 0) {
                System.out.println((char)i + " -> " + freq[i]);
            }
        }
    }
}