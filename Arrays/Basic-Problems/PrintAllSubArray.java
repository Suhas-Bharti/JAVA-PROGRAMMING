/*
Problem: Print All Subarrays of an Array

Description:
Given an array of integers, print all possible contiguous subarrays.

A subarray is a continuous part of an array formed by selecting 
a starting index and an ending index.

Example:

Input:
arr = [2, 4, 6, 8, 10]

Output:
2
2 4
2 4 6
2 4 6 8
2 4 6 8 10

4
4 6
4 6 8
4 6 8 10

6
6 8
6 8 10

8
8 10

10

Approach:
- Use three nested loops.
- First loop selects the starting index of the subarray.
- Second loop selects the ending index of the subarray.
- Third loop prints elements between start and end.

Time Complexity: O(n³)
Space Complexity: O(1)

Author: Suhas Bharti
*/

public class PrintAllSubArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};

        printSubArray(arr);
    }

    // Method to perform Print All Sub Array 
    public static void printSubArray(int[] arr) {
        for(int start=0; start<arr.length; start++){
            for(int end=start; end<arr.length; end++){
                for(int k=start; k<=end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}