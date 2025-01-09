package coder25.problemSolving1.mphasis.sorting;

import java.util.Arrays;

public class MergeSortAl {
    public static void main(String[] args) {
        int arr[] = {14, 84, 65, 39, 12, 75, 756,1};
        int start = 0;
        int end = arr.length;
        mergeSort(arr, start, end-1);
        System.out.println(Arrays.toString(arr));

    }

    private static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + (end - 1)) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }

    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[start + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid + 1 + i];
        }
//        System.out.println("printing left " + Arrays.toString(left));
//        System.out.println("printing right " + Arrays.toString(right));
        int i = 0, j = 0;
        int k = start;
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
            k++;
            j++;
        }

    }

}
