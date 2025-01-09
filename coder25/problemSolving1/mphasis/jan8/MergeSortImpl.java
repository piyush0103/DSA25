package coder25.problemSolving1.mphasis.jan8;

public class MergeSortImpl {
    public static void main(String[] args) {
        {
            int arr[] = {12, 11, 13, 5,5,9,9,9, 6, 7};
            System.out.println("Given array is");
            printArray(arr);
            sort(arr, 0, arr.length - 1);
            System.out.println("\nSorted array is");
            printArray(arr);
        }

    }

    private static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            sort(arr, low, mid);
            sort(arr, mid + 1, high);
            mergeSort(arr, low, mid, high);
        }
    }

    private static void mergeSort(int[] arr, int low, int mid, int high) {
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
        int i = 0;
        int j = 0;
        int k = low;
        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else {
                arr[k] = right[j];
                j++;
                k++;
            }
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

    private static void printArray(int[] arr) {
        System.out.print(" [ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(" ]");
    }
}
