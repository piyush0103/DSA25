package coder25.problemSolving1.Arrays.sorting;

import java.util.Arrays;

public class KthLargestUsingQuickSelect {
    public static void main(String[] args) {
        int arr[] = {3,2,3,1,2,4,5,5,6};
        int k = arr.length-4;
//        int x = findKthLargestElement(arr, k);
        int x = findKthLargestq(arr, 0, arr.length - 1, k);
        System.out.println(x + " is this the answer bro");
    }

    private static int findKthLargestq(int[] arr, int low, int high, int k) {

        int partition = quickSelect(arr, low, high);
        System.out.println(partition+" got");
        if (partition == k) {
            return arr[partition];
        } else if (partition < k) {
            return findKthLargestq(arr, partition + 1, high, k);
        } else {
            return findKthLargestq(arr, low, partition - 1, k);
        }

    }

    private static int quickSelect(int[] arr, int low, int high) {
        System.out.println(low+"  "+high+" s");
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                System.out.println(Arrays.toString(arr)+" before");
                swap(arr, i, j);
                System.out.println(Arrays.toString(arr)+" after");

            }
        }
        swap(arr, high, i + 1);
        return i+1;
    }

    private static void swap(int arr[], int x, int y) {
      int temp=arr[x];
      arr[x]=arr[y];
      arr[y]=temp;
    }
}
