package coder25.problemSolving1.Arrays.matrix;

import java.util.Arrays;

public class UniquePath {
    public static void main(String[] args) {
        int paths = findUnoquePaths(3, 3);
        System.out.println("total paths " + paths);
    }

    private static int findUnoquePaths(int m, int n) {
        int[] aboveRow = new int[n];
        Arrays.fill(aboveRow, 1);

        for (int row = 1; row < m; row++) {
            int[] currentRow = new int[n];
            Arrays.fill(currentRow, 1);
            for (int col = 1; col < n; col++) {
                currentRow[col] = currentRow[col - 1] + aboveRow[col];
            }
            aboveRow = currentRow;
        }

        return aboveRow[n - 1];
    }
}