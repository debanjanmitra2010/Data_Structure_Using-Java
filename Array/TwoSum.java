import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Given an arr of integers, return the indices of the two numbers that add up to a given target.
public class TwoSum {
    public static int[] sum(int[] arr, int target) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (sum == target) {
                    int[] pairs = {i, j};
                    return pairs;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {1,6};
        int[] pairs = sum(arr,7);
        System.out.println(Arrays.toString(pairs));
    }
}
