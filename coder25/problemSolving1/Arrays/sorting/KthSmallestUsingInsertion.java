package coder25.problemSolving1.Arrays.sorting;

public class KthSmallestUsingInsertion {
    public static void main(String[] args) {
        int arr[] = {10, 8, 6, 2, 4, 9, 6};
        int k = 2;
        System.out.println(findKthSmallesElement(arr, k - 1));
    }

    private static int findKthSmallesElement(int[] arr, int k) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int key = arr[i];
            while (j >= 0 && arr[j] > arr[j + 1]) {
                arr[j] += arr[j + 1];
                arr[j + 1] = arr[j] - arr[j + 1];
                arr[j] -= arr[j + 1];
                j--;
            }
            arr[j+1] = key;
        }
        return arr[k];
    }
}
