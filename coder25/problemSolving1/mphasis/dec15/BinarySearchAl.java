package coder25.problemSolving1.mphasis.dec15;

public class BinarySearchAl {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 9, 15, 63, 88};
        int target = 63;
        int index = binarySearch(arr, target);
        System.out.println(index + "   " + arr[index]);
    }

    private static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        if (arr.length < 0 || arr == null) {
            return -1;
        }
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                low = mid + 1;
            }
            if (arr[mid] > target) {
                high = mid - 1;
            }

        }
        return -1;
    }
}
