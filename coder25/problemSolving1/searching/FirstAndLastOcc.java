package coder25.problemSolving1.searching;

import java.util.Arrays;

public class FirstAndLastOcc {
    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 8, 8,8, 10};
        int target = 8;
        int result = 0;
        int arra[] = {findFirsttOccurrence(arr, target, 0, arr.length - 1, -1), findLastOccurrence(arr, target, 0, arr.length - 1, -1)};
        System.out.println(Arrays.toString(arra));

    }

    private static int findFirsttOccurrence(int[] arr, int target, int low, int high, int result) {
        if (low > high) {
            return result;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            result = mid;
            return findFirsttOccurrence(arr, target, low, mid - 1, result);
        }
        if (arr[mid] > target) {
            return findFirsttOccurrence(arr, target, low, mid - 1, result);
        }
        if (arr[mid] < target) {

            return findFirsttOccurrence(arr, target, mid + 1, high, result);
        }
        return result;
    }

    private static int findLastOccurrence(int[] arr, int target, int low, int high, int result) {
        if (low > high) {
            return result;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            result = mid;
            return findLastOccurrence(arr, target, mid + 1, high, result);
        }
        if (arr[mid] > target) {
            return findLastOccurrence(arr, target, low, mid - 1, result);
        }
        if (arr[mid] < target) {
            return findLastOccurrence(arr, target, mid + 1, high, result);
        }
        return result;
    }
}
