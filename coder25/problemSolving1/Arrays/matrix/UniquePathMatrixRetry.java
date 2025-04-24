package coder25.problemSolving1.Arrays.matrix;

import java.util.Arrays;

public class UniquePathMatrixRetry {
    public static void main(String[] args) {
        int m = 3, n = 3;
        System.out.println(finduniquePath(m, n) + "    hmmmm pnhysics...!");
    }

    private static int finduniquePath(int m, int n) {
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = 1;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                mat[i][j] = mat[i][j - 1] + mat[i - 1][j];
            }
        }
        return mat[m - 1][n - 1];
    }
}