package coder25.problemSolving1.mphasis.dec15;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 9, 15, 63, 88};
        int target = 15;
        int index = binarySearchRec(arr, 0, arr.length - 1, target);
        System.out.println(index + "   " + arr[index]);
    }

    private static int binarySearchRec(int[] arr, int low, int high, int target) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                low = mid + 1;
                return binarySearchRec(arr, low, high, target);
            }
            if (arr[mid] > target) {
                high = mid - 1;
                return binarySearchRec(arr, low, high, target);
            }

        }
        return -1;
    }
}