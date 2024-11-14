package coder25.problemSolving1.Arrays;

public class ZeroOneMatrix {
    public static void main(String[] args) {
        int arr[][] = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int mat[][] = updateMatrix(arr);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print("| "+mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] updateMatrix(int[][] mat) {
        int result[][] = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                result[i][j] = mat[i][j] == 0 ? 0 : Integer.MAX_VALUE - 1000;

            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (result[i][j] != 0) {
                    for (int k = 0; k < mat.length; k++) {
                        for (int l = 0; l < mat[0].length; l++) {
                            if (mat[k][l] == 0) {
                                result[i][j] = Math.min(result[i][j], Math.abs(k - i) + Math.abs(l - j));
                            }
                        }
                    }
                }

            }

        }
        return result;
    }
}