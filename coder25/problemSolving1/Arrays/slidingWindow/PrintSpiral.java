package coder25.problemSolving1.Arrays.slidingWindow;

import coder25.problemSolving1.Arrays.matrix.PrintDiagonal;

public class PrintSpiral {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        PrintDiagonal.print2DMAtrix(mat);
        System.out.println("now spiral print  ");
        spiralPrint(mat.length, mat[0].length,
                mat);
    }

    private static void spiralPrint(int row, int col, int[][] mat) {
        int top = 0;
        int left = 0;
        int right = col - 1;
        int bottom = row - 1;
        int spiral[][] = new int[row][col];
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(mat[top][i] + " ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(mat[i][right] + " ");
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(mat[bottom][i] + " ");
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(mat[i][left] + " ");
                }
                left++;
            }

        }

    }
}

