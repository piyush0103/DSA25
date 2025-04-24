package coder25.problemSolving1.Arrays.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {-50, -4, -9, -5, -7, -88, -1, -2, -3};
        System.out.println(Arrays.toString(arr) + " originial array");
        System.out.println(Arrays.toString(insertionSort(arr)) + "  sorted Array");

    }

    private static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int key = arr[i];
            while (j >= 0 && arr[j] > key) {
//    swap
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

        }
        return arr;
    }
}