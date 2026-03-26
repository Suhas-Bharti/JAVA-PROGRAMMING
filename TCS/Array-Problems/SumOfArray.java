/*
Problem: Find Sum of Array Elements

Description:
Given an array of integers, calculate the sum of all elements present in the array.

Input:
- First line contains an integer n (size of array)
- Second line contains n space-separated integers

Output:
Return the sum of all elements in the array

Example:
Input:
5
1 2 3 4 5

Output:
15

Explanation:
Sum = 1 + 2 + 3 + 4 + 5 = 15

Approach:
- Initialize a variable sum = 0
- Traverse the array using a loop
- Add each element to sum
- Return the final sum

Time Complexity: O(n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

public class SumOfArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int result = sumOfArray(arr);
        System.out.println("Sum of all elements: " + result);
    }

    // Method to calculate the sum of all elements present in the array
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}