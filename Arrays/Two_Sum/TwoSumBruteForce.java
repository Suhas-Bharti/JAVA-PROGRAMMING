/*
Problem: Two Sum (Brute Force)

Description:
Given an array of integers and a target value, find two numbers in the array
whose sum is equal to the target. Return the indices of those two numbers.

If no such pair exists, return [-1, -1].

Example:
Input:
arr = [2, 7, 8, 9, 12]
target = 20

Output:
[2, 4]

Explanation:
arr[2] + arr[4] = 8 + 12 = 20

Time Complexity: O(n^2)
Space Complexity: O(1)

Author: Suhas Bharti
*/

public class TwoSumBruteForce {
    public static void main(String[] args) {
        int[] arr = {2, 7, 8, 9, 12};
        int target = 20;

        int[] result = twoSum(arr, target);
        System.out.println("Indicies: " + result[0] + "," + result[1]);
    }

    public static int[] twoSum(int[] arr, int target) {
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }
}