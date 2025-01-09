package coder25.problemSolving1.mphasis.jan8;

import java.util.Arrays;

public class KthSmallestElement {
    public static void main(String[] args) {
        int arr[] = {5, 20, 10, 7, 1};
        int k = 2;
        int ans = findThekthSmallest(arr, k);
        System.out.println("Kth smallest element " + ans);
    }

    private static int findThekthSmallest(int[] arr, int k) {
        if (arr.length > 0 && arr != null) {
            Arrays.sort(arr);
            k = k % arr.length;
            return arr[k];
        }
        return -1;

    }
}
