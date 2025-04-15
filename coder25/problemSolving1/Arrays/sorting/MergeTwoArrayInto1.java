package coder25.problemSolving1.Arrays.sorting;

import java.util.Arrays;

public class MergeTwoArrayInto1 {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 10, 15, 0, 0, 0, 0};
        int arr2[] = {5, 7, 8, 16};
        mergeTwoArrayintoFirst(arr1, 4, arr2, arr2.length);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));

    }

    private static void mergeTwoArrayintoFirst(int[] arr1, int m, int[] arr2, int n) {
        int right = m + n - 1;
        int len1 = m - 1;
        int len2 = n - 1;
        while (len2 >= 0) {
            if (len1 >= 0 && arr1[len1] > arr2[len2]) {
                arr1[right] = arr1[len1];
                len1--;
            } else {
                arr1[right] = arr2[len2];
                len2--;
                System.out.println(len2+"   zsed");
                System.out.println(Arrays.toString(arr1));
            }
            right--;
        }

    }
}
