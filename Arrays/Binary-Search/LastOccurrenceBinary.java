/*
Problem: Last Occurrence using Binary Search

Description:
Given a sorted array with duplicate elements,
find the last occurrence of the target element.

Input:
arr = [1,2,2,2,3,4]
target = 2

Output:
3

Time Complexity: O(log n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

public class LastOccurrenceBinary {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4};
        int target = 2;

        int index = lastOccurrence(arr, target);
        System.out.println("Last Occurrence of " + target + " is at index: " + index );
    }

    // Method to perform Last Occurrence Binary Search

    public static int lastOccurrence(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int result = -1;  // store last occurrence

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                result = mid;  // store index
                start = mid + 1;  // move right to find later occurrence
            } else if(arr[mid] < target) {
                start = mid + 1;  // search right half
            } else {
                end = mid - 1;  // search left half
            }
        }
        return result;
    }
}