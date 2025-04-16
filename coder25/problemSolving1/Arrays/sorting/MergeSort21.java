package coder25.problemSolving1.Arrays.sorting;

import java.util.Arrays;

public class MergeSort21 {
    public static void main(String[] args) {
        int[] arr = {10, 1, 22, 2, 33, 3, 44, 4};
        int len = arr.length;
        merge(arr, 0, len - 1);
        System.out.println(Arrays.toString(arr) + " after sort");
    }

    private static void merge(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            merge(arr, low, mid);
            merge(arr, mid + 1, high);
            sort(arr, low, high, mid);
        }
    }

    private static void sort(int[] arr, int low, int high, int mid) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[low + i];

        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid + 1 + i];

        }
        int i = 0, j = 0;
        int k = low;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }

    }

}
