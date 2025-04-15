package coder25.problemSolving1.Arrays.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {10,4, 8, 9, 7, 15, 2, 3};
        System.out.println(Arrays.toString(arr) + " before sorting");
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr) + " before sorting");

    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] += arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
            System.out.println(Arrays.toString(arr)+"   "+i);
        }
    }
}
