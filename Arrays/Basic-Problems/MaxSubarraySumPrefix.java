/*
Problem: Maximum Sum Subarray (Prefix Sum Approach)

Description:
Given an array of integers, find the contiguous subarray
with the maximum possible sum.

This solution uses the Prefix Sum technique to optimize
the calculation of subarray sums.

Example:
Input:
arr = [-2, 3, -4, 5, 7, 9]

Output:
21

Explanation:
The subarray [5, 7, 9] has the maximum sum = 21.

Approach:
1. Create a prefix sum array where each element stores
   the sum of elements from index 0 to i.
2. For every subarray (start to end), calculate the sum using:
      sum = prefix[end] - prefix[start-1]
3. Track the maximum sum encountered.

Time Complexity: O(n²)
Space Complexity: O(n)

Author: Suhas Bharti
*/

import java.util.*;

public class MaxSubarraySumPrefix {

    public static void main(String[] args) {
        int[] arr = {-2, 3, -4, 5, 7, 9};

        prefixSum(arr);
    }

    // Method to perform Max Subarray Sum using Prefix Sum
    public static void prefixSum(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        // Calculate prefix array
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int start=0; start<arr.length; start++){
            for(int end=start; end<arr.length; end++){
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Max Sum = " + maxSum);
    }
}