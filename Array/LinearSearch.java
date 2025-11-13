import java.util.*;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 1, 3};
        int target = 3;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    public static int linearSearch(int[] arr, int target) {
        for(int i=0; i<arr.length; i++) {
            if(target == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
