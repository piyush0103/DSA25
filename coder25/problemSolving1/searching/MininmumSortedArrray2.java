package coder25.problemSolving1.searching;

public class MininmumSortedArrray2 {
    public static void main(String[] args) {
        int arr[] = {3,1,1};
        System.out.println(findMinInRotatedArray2(arr));
    }

    private static int findMinInRotatedArray2(int[] arr) {
            int low = 0;
            int high = arr.length - 1;
            while (low < high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] == arr[high] && arr[mid] == arr[low]) {
                    low++;
                    high--;
                } else if (arr[mid] <= arr[high] ) {
                    high = mid;
                } else {
                    low = mid+1;
                }
            }
            return arr[low];
        }

    }
