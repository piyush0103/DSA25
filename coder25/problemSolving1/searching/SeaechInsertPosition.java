package coder25.problemSolving1.searching;

public class SeaechInsertPosition {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6};
        int target = 5;
        System.out.println(findInsertPosition(arr, target));
    }

    private static int findInsertPosition(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = arr.length - 1;
        if (n == 0) {
            return 0;
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                high = mid - 1;
            }
            if (arr[mid] < target) {
                low = mid + 1;
            }
        }
        return low;
    }
}
