package coder25.problemSolving1.Arrays.sorting;

import java.util.Arrays;

public class SortTwoArrays {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 10, 15};
        int arr2[] = {5, 7, 8, 16};
        sortTwoArrays(arr1, arr1.length, arr2, arr2.length);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }

    private static void sortTwoArrays(int[] arr1, int m, int[] arr2, int n) {
        int i = m - 1;
        int j = 0;
        while (i >= 0 && j < n) {
            if (arr1[i] > arr2[j]) {
                i--;
            } else {
                int temp = arr2[j];
                arr2[j] = arr1[i];
                arr1[i] = temp;
                j++;
                i--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}