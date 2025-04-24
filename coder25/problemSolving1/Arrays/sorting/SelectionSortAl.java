package coder25.problemSolving1.Arrays.sorting;

import java.util.Arrays;

public class SelectionSortAl {
    public static void main(String[] args) {
        int arr[] = {50, 4, 9, 5, 7, 88, 1, 2, 3};
        System.out.println(Arrays.toString(arr) + " originial array");
        System.out.println(Arrays.toString(selectSort(arr)) + "  sorted Array");

    }

    private static int[] selectSort(int[] arr) {
        int min_index = 0;
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            arr[i] = arr[i] + arr[min_index];
            System.out.println(arr[i]+" "+arr[min_index]+"  ");
            arr[min_index] = arr[i] - arr[min_index];
            arr[i] = arr[i] - arr[min_index];
        }
        return arr;
    }
}
