/*
Problem: Basic Linear Search

Description:
Given an array of integers and a target value, implement the Linear Search algorithm 
to find the index of the target element in the array.

Linear Search works by checking each element of the array sequentially until the 
target element is found or the array ends.

If the element is found, return its index.
If the element is not present in the array, return -1.

Input:
arr = [10, 20, 30, 15, 40, 25, 50]
target = 15

Output:
3

Time Complexity: O(n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

public class BasicLinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 15, 40, 25, 50};
        int target = 15;

        int result = linearSearch(arr, target);

        if(result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array");
        }

    }

    //Method to perform Linear Search
    public static int linearSearch(int[] arr, int target) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                return i;  // element found
            }
        }
        return -1; // element not found
    }
}