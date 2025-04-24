package coder25.problemSolving1.searching;

public class SearchInRotatedArrray {
    public static void main(String[] args) {
        int arr[] = {5, 1, 3};
        int target = 1;
        System.out.println(searchRotatedArray(arr, target));
    }

    private static int searchRotatedArray(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] >= arr[high]) {
                if (arr[low] <= target && arr[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            } else {
                if (target <= arr[high]&&target >= arr[mid]  ) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            }

        }
        return -1;

    }
}
