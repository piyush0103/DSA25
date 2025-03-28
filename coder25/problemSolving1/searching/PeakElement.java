package coder25.problemSolving1.searching;

public class PeakElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1};
        System.out.println(findPeakElement(arr));
    }

    private static int findPeakElement(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[mid + 1]) {
                high = mid;
            }
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            }
        }
        return low;
    }
}
