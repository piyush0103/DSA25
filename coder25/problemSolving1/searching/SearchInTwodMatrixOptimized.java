package coder25.problemSolving1.searching;

public class SearchInTwodMatrixOptimized {
    public static void main(String[] args) {
        int arr[][] = {{1}};
        System.out.println(search2DMaatrixOp(arr, 1));
    }

    private static boolean search2DMaatrixOp(int[][] mat, int target) {
        int m = mat.length, n = mat[0].length;
        int left = 0, right = m * n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int row = mid / n, col = mid % n;
            if (mat[row][col] == target) return true;
            else if (mat[row][col] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}