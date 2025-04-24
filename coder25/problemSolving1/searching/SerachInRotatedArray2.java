package coder25.problemSolving1.searching;

public class SerachInRotatedArray2 {
    public static void main(String[] args) {
        //array might contain duplicate
        int arr[] = {1};
        int target = 0;
        System.out.println(searchRotatedArray2(arr, target));

    }

    private static boolean searchRotatedArray2(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return true;
            }
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
            } else if (arr[low] <= arr[mid]) { // left array is sorted
                if (arr[low] <= target && target <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {                           // right array is sorted
                if (arr[mid] <= target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}