package coder25.problemSolving1.recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(reverseArr(arr, 0, arr.length - 1)));
    }

    private static int[] reverseArr(int[] arr, int low, int high) {
        if (low >= high) {
            return arr;
        }
        arr[low] += arr[high];
        arr[high] = arr[low] - arr[high];
        arr[low] = arr[low] - arr[high];
        return reverseArr(arr, low + 1, high - 1);
    }

}
