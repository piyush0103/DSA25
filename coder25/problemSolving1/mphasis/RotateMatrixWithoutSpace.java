package coder25.problemSolving1.mphasis;

import coder25.problemSolving1.Arrays.matrix.PrintDiagonal;

public class RotateMatrixWithoutSpace {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        PrintDiagonal.print2DMAtrix(mat);
        transposeMaytrixWithoutSpace(mat);
        System.out.println("=============================================================TRANSPOSE MATRIX=======================================================================");
        PrintDiagonal.print2DMAtrix(mat);
        System.out.println("=============================================================ROTATE WITHOUT SPACE MATRIX=======================================================================");
        rotateMatrixWithoutSpace(mat);
        PrintDiagonal.print2DMAtrix(mat);
    }

    private static void rotateMatrixWithoutSpace(int[][] mat) {
        int temp = 0;
        for (int i = 0; i < mat.length; i++) {
            int start = 0;
            int end = mat[0].length - 1;
            while (start < end) {
                temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
                start++;
                end--;

            }
        }

    }

    private static void transposeMaytrixWithoutSpace(int[][] mat) {
        int temp = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = i; j < mat[0].length; j++) {
                temp = mat[j][i];
                mat[j][i] = mat[i][j];
                mat[i][j] = temp;
            }

        }
    }
}
