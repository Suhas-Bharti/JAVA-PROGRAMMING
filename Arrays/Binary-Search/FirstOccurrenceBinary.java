/*
Problem: First Occurrence using Binary Search

Description:
Given a sorted array with duplicate elements,
find the first occurrence of the target element.

Input:
arr = [1,2,2,2,3,5, 6]
target = 2

Output:
1

Time Complexity: O(log n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

public class FirstOccurrenceBinary {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 5, 6};
        int target = 2;

        int index = firstOccurrence(arr, target);
        System.out.println("The first occurrence of " + target + " is at index: " + index);
    }

    // Method to perform First Occurrence Binary Search
    public static int firstOccurrence(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int result = -1;  // Variable to store the first occurrence index

        while(start <= end) {
            int mid = start + (end - start) / 2;  // Calculate middle index

            if(arr[mid] == target) {
                result = mid;  // store currrent index
                end = mid - 1; // move left to find  occurrence
            } else if(arr[mid] < target) {
                start = mid + 1;  // Search in right half
            } else {
                end = mid - 1;   // Search in left half
            }
        }
        return result;  // Return the first occurrence index
    }
}