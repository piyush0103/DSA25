package coder25.problemSolving1.searching;

public class SearchInTwodmatrix {
    public static void main(String[] args) {
        int arr[][] = {{1}};
        System.out.println(search2DMatrix(arr, 1));
    }

    private static boolean search2DMatrix(int[][] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int low = 0;
           int  high = arr[0].length - 1;
            if (arr[i][low] <= target && arr[i][high] >= target) {
                while (low <= high) {
                    int mid = low + (high - low) / 2;
                    if (arr[i][mid] == target) {
                        return true;
                    }
                    if (arr[i][mid] < target) {
                        low = mid + 1;
                    }
                    if (arr[i][mid] > target) {
                        high = mid - 1;
                    }

                }
            } else {
            }
        }
        return false;
    }
}
