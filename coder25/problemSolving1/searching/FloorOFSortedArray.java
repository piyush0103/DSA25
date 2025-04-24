package coder25.problemSolving1.searching;

public class FloorOFSortedArray {
    public static void main(String[] args) {
        int arr[] = {4, 15, 17, 17, 19, 20, 21, 22, 22, 25, 28, 28, 28, 31, 31, 32, 33, 34, 34, 35, 36, 36, 37, 38, 38, 39, 41, 41, 42, 43, 43, 44, 44, 45, 45, 46, 47, 49, 49, 50, 50, 50, 51, 53, 54, 54, 56, 57, 58, 58, 59, 60, 64, 67, 69, 75, 94
        };
        int target = 26;
        System.out.println(findFloor(arr, target));
    }

    private static int findFloor(int[] arr, int target) {
        if (target < arr[0]) {
            return -1;
        }
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        return floorOfSortedArray(arr, target, left, right, result);
    }


    private static int floorOfSortedArray(int[] arr, int x, int left, int right, int result) {
        int mid = left + (right - left) / 2;
        if(left>right){
            return result;
        }
        if (arr[mid] == x) {
            result=mid;
            return floorOfSortedArray(arr, x, mid + 1, right, result);
        }
        if (arr[mid] > x) {
            return floorOfSortedArray(arr, x, left, mid - 1, result);
        }
        if (arr[mid] < x) {
            result=mid;
            return floorOfSortedArray(arr, x, mid + 1, right, result);
        }
        return result;
    }
}