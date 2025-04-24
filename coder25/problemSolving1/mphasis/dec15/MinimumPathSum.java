package coder25.problemSolving1.mphasis.dec15;

import coder25.problemSolving1.Arrays.matrix.PrintDiagonal;

public class MinimumPathSum {
    public static void main(String[] args) {
        int arr[][] = {{1, 5, 6}, {4, 3, 2}, {2, 1, 0}, {0, 5, 4}};
        PrintDiagonal.print2DMAtrix(arr);
        System.out.println("==================================================================xxxxxxxxxxxxxxxxxxx======================================================================");
        System.out.println(findMinPathInMatrix(arr));
    }

    private static int findMinPathInMatrix(int[][] arr) {
        if(arr==null){
            return -1;
        }
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 1; i < m; i++) {
            arr[i][0] += arr[i - 1][0];
        }
        for (int i = 1; i < n; i++) {
            arr[0][i] += arr[0][i - 1];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] += Math.min(arr[i - 1][j], arr[i][j - 1]);
            }

        }
        PrintDiagonal.print2DMAtrix(arr);
        System.out.println("==================================================================xxxxxxxxxxxxxxxxxxx======================================================================");
        return arr[m - 1][n - 1];
    }
}
