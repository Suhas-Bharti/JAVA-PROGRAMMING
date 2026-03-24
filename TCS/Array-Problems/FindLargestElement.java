/*
Problem: Find Largest Element in Array with Index

Description:
Given an array of integers, find the largest element present in the array 
along with its index.

Input:
An integer array arr[]

Output:
Return an array where:
[0] = largest element
[1] = index of the largest element

Example:
Input:  [20, 45, 17, 34, 86, 30]
Output: [86, 4]

Explanation:
86 is the largest element in the array and it is present at index 4.

Approach:
- Initialize maxValue with first element
- Initialize index = 0
- Traverse the array
- If a larger element is found, update maxValue and index
- Return both values as an array

Time Complexity: O(n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

public class FindLargestElement {

    public static void main(String[] args) {
        int[] arr = {20, 45, 17, 34, 86, 30};

        int[] result = largestElement(arr);
        System.out.println("Largest element is: " + result[0] + " and index is: " + result[1]);
    }

    // Method to perform the find largest element in given array
    public static int[] largestElement(int[] arr) {
        int index = 0;
        int maxValue = arr[0];

        for(int i=0; i<arr.length; i++) {
            if(maxValue < arr[i]) {
                maxValue = arr[i];
                index = i;
            }
        }

        return new int[]{maxValue, index};
    }
}