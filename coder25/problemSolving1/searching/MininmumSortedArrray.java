package coder25.problemSolving1.searching;

public class MininmumSortedArrray {
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        System.out.println(findMinInRotatedArray(arr));
    }

    private static int findMinInRotatedArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <arr[high]) {
                high = mid ;
            } else {
                low = mid+1;
            }
        }
        return arr[low];
    }
}
