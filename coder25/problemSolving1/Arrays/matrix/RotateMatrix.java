package coder25.problemSolving1.Arrays.matrix;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        PrintDiagonal.print2DMAtrix(mat);
        int rotatedMatrix[][] = new int[mat[0].length][mat.length];
        rotateMatrix(mat, rotatedMatrix);
        System.out.println("=============================================================ROTATE MATRIX=======================================================================");
        PrintDiagonal.print2DMAtrix(rotatedMatrix);

    }

    private static void rotateMatrix(int[][] mat, int[][] rotatedMatrix) {
        int row = mat.length;
        int col = mat[0].length;
        int k = col - 1;
        for (int i = 0; i < row; i++) {
            int l = 0;
            for (int j = 0; j < col; j++) {
                rotatedMatrix[j][k] = mat[i][j];
            }
            k--;
        }
    }
}