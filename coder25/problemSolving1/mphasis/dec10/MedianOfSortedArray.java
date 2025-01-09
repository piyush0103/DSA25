package coder25.problemSolving1.mphasis.dec10;

import java.util.Arrays;

public class MedianOfSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 12, 15, 26, 38};
        int[] arr2 = {2, 13, 17, 30, 45};
        System.out.println(Arrays.toString(getMedian(arr1, arr2)));
    }

    private static int[] getMedian(int[] arr1, int[] arr2) {
        int arr[] = new int[arr1.length + arr2.length];
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr[k] = arr1[i];
            k++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[k] = arr2[i];
            k++;
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        return arr;
    }
}
