package coder25.problemSolving1.searching;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 3};
        System.out.println(findSingleElement(arr));
    }

    private static int findSingleElement(int[] arr) {
        if (arr.length < 2) {
            return arr[0];
        }
        if (arr.length == 2) {
            return -1;
        }
        int result = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid % 2 != 0) {
                if (mid == high) {
                    return arr[mid];
                }
                if (arr[mid] != arr[mid + 1]) {
                    low = mid + 1;

                } else {
                    high = mid - 1;
                }

            } else {
                if (mid == 0) {
                    return arr[mid];
                }
                if (mid == high) {
                    return arr[mid];
                }
                if (arr[mid] != arr[mid + 1]) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }

        }
        return arr[low];
    }
}
