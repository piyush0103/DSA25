package coder25.problemSolving1.searching;

public class BinarySearchRec {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        int result = binarySearchRec(arr, x, 0, arr.length - 1);
        if (result >= 0) {
            System.out.println(result + " element present");
        } else {
            System.out.println("element not presemt");
        }
    }

    private static int binarySearchRec(int[] arr, int x, int low, int high) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            return arr[mid] > x ? binarySearchRec(arr, x, low, mid - 1) : binarySearchRec(arr, x, mid + 1, high);
        }else
        {
            return -1;
        }
    }
}
