package coder25.problemSolving1.Arrays.sorting;

public class InversionCount {
    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 1};
        System.out.println(countInv(arr,0,arr.length-1));
    }

    static int countAndMerge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1, n2 = r - m;
        // Set up two arrays for left and right halves
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++)
            left[i] = arr[i + l];
        for (int j = 0; j < n2; j++)
            right[j] = arr[m + 1 + j];
        // Initialize inversion count (or result)
        // and merge two halves
        int res = 0;
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            // No increment in inversion count
            // if left[] has a smaller or equal element
            if (left[i] <= right[j])
                arr[k++] = left[i++];
                // If right is smaller, then it is smaller than n1-i
                // elements because left[] is sorted
            else {
                arr[k++] = right[j++];
                res += (n1 - i);
            }
        }
        // Merge remaining elements
        while (i < n1)
            arr[k++] = left[i++];
        while (j < n2)
            arr[k++] = right[j++];
        return res;
    }

    // Function to count inversions in the array
    static int countInv(int[] arr, int l, int r) {
        int res = 0;
        if (l < r) {
            int m = (r + l) / 2;
            // Recursively count inversions
            // in the left and right halves
            res += countInv(arr, l, m);
            res += countInv(arr, m + 1, r);
            // Count inversions such that greater element is in
            // the left half and smaller in the right half
            res += countAndMerge(arr, l, m, r);
        }
        return res;
    }

}

