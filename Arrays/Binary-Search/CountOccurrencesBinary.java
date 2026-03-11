/*
Problem: Count Occurrences using Binary Search

Description:
Given a sorted array, count how many times a target element appears.

Formula:
count = lastOccurrence - firstOccurrence + 1

Input:
arr = [1,2,2,2,3,4]
target = 2

Output:
3

Time Complexity: O(log n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

public class CountOccurrencesBinary {
    public static void main(String[] args){
        int[] arr = {1, 2, 2, 2, 3, 4};
        int target = 2;

        int count = countOccurrence(arr, target);

        System.out.println("Occurence of " + target + " = " + count);

    }

    // Find first occurrence of target
    public static int firstOccurrence(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int result = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                result = mid; // store current index
                end = mid - 1; // move left to find first occurence
            } else if(arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }

    // Find last occurrence of target
    public static int lastOccurrence(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int result = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] ==  target) {
                result = mid;
                start = mid + 1; // move right to find last occurrence
            } else if(arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }

    // Count occurrences
    public static int countOccurrence(int[] arr, int target) {
        int first = firstOccurrence(arr, target);

        if(first == -1){
            return 0; // element not found
        }

        int last = lastOccurrence(arr, target);

        return last - first + 1;
    }
}