package coder25.problemSolving1.searching;

import java.util.Arrays;

public class FindFirstAndLastOneMethod {
    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 8, 8, 8, 10};
        int target = 8;
        int result = 0;
        int arra[] = {FindFirstAndLastOneOcc(arr, target, 0, arr.length - 1, -1, true), FindFirstAndLastOneOcc(arr, target, 0, arr.length - 1, -1, false)};
        System.out.println(Arrays.toString(arra));

    }

    private static int FindFirstAndLastOneOcc(int[] arr, int target, int low, int high, int result, boolean isFisrt) {
        if (low > high) {
            return result;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            result = mid;
            if (isFisrt) {
                return FindFirstAndLastOneOcc(arr, target, low, mid - 1, result, isFisrt);
            } else {
                return FindFirstAndLastOneOcc(arr, target, mid + 1, high, result, isFisrt);
            }
        }
        if (arr[mid] > target) {
            return FindFirstAndLastOneOcc(arr, target, low, mid - 1, result, isFisrt);
        }
        if (arr[mid] < target) {
            return FindFirstAndLastOneOcc(arr, target, mid + 1, high, result, isFisrt);
        }
        return result;
    }

}

