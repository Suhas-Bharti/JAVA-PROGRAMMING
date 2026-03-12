/*
Problem: Maximum Sum Subarray (Kadane's Algorithm)

Description:
Given an array of integers, find the contiguous subarray
which has the maximum possible sum.

This solution uses Kadane's Algorithm which efficiently
calculates the maximum subarray sum in linear time.

Example:
Input:
arr = [-2, -3, 4, -1, -2, 1, 5, -3]

Output:
7

Explanation:
The subarray [4, -1, -2, 1, 5] has the maximum sum = 7.

Approach:
1. Traverse the array once.
2. Maintain a running sum (currSum).
3. If currSum becomes negative, reset it to 0.
4. Update maxSum whenever a larger sum is found.

Time Complexity: O(n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.*;

public class MaxSubarrayKadanesAlgorithm {
    public static void main(String[] args){
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

        int result = kadanesAlgorithm(arr);
        System.out.println("Maximum Subarray Sum = " + result);
    }

    // Method to perform Max Subarray Sum using Kadane's Algorithm
    public static int kadanesAlgorithm(int[] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            currSum = currSum + arr[i];
            if(currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);  
        }

        return maxSum;
    }
}