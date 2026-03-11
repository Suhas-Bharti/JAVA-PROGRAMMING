/*
Problem: Reverse an Array

Description:
Given an array of integers, reverse the array in-place so that the first element
becomes the last and the last element becomes the first.

Approach:
Use the Two Pointer Technique:
- One pointer starts at the beginning of the array.
- Another pointer starts at the end of the array.
- Swap the elements at both pointers.
- Move the start pointer forward and the end pointer backward.
- Continue until start < end.

Input:
arr = [1, 2, 3, 4, 5]

Output:
[5, 4, 3, 2, 1]

Time Complexity: O(n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

public class ReverseArrayTwoPointer {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        reverseArray(arr);
        //print reverse array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length-1;

        //Swapping
        while(start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }
    }
}