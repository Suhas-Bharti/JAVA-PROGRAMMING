/*
Problem: Print All Pairs in an Array

Description:
Given an array of integers, print all possible unique pairs of elements.
A pair consists of two elements (arr[i], arr[j]) where i < j.

The program should generate every possible pair combination
without repeating the same pair or pairing an element with itself.

Example:
Input:
arr = [2, 4, 6, 8, 10]

Output:
(2,4) (2,6) (2,8) (2,10)
(4,6) (4,8) (4,10)
(6,8) (6,10)
(8,10)

Approach:
Use two nested loops:
- The first loop selects the first element of the pair.
- The second loop selects the second element starting from the next index.

Time Complexity: O(n²)
Space Complexity: O(1)

Author: Suhas Bharti
*/

public class PairsArray{
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};

        printPairs(arr);
    }

    // Method to print all possible pairs in the array
    public static void printPairs(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
            }
            System.out.println();
        }
    }
}