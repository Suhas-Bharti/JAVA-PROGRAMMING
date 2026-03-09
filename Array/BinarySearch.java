import java.util.*;
// Binary Search

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 6, 10, 12, 14, 15};
        int key = 10;

        System.out.println("Index for key is: " + binarySearch(numbers, key));
    }

    public static int binarySearch(int[] numbers, int key){
        int start = 0;
        int end = numbers.length-1;

        while(start <= end) {
            int mid = (start + end) / 2;

            //comparisons
            if(numbers[mid] == key) {
                return mid;
            }
            if(numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}