package coder25.problemSolving1.Arrays.matrix;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        PrintDiagonal.print2DMAtrix(mat);
        int arr[][] = new int[mat[0].length][mat.length];
        findTransposeMatrix(mat, arr);
        System.out.println("========================================================================================================TRANSPOSING=================================================================================");
        PrintDiagonal.print2DMAtrix(arr);

    }

    private static void findTransposeMatrix(int[][] mat, int[][] arr) {
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat.length; j++) {
                arr[i][j] = mat[j][i];
            }

        }

    }
}
