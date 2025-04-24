package coder25.problemSolving1.Arrays.matrix;

public class AllDiagonalsOfRenctangle {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}};
        PrintDiagonal.print2DMAtrix(arr);
        System.out.println("=============================================================================MATRIX===================================================================================");
        System.out.println();
        System.out.println("=============================================================================DIAGONAL===================================================================================");
//        printAllRightToleftDiagonal(arr);
        printAllleftRightDiagonal(arr);
    }

    private static void printAllleftRightDiagonal(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        if (row < col) {
            System.out.println("print from left to right");
            for (int i = 0; i < row; i++) {
                int srow = i;
                printDiagonalInner(arr, srow, srow);

            }
            System.out.println("print from  right to left");
            for (int i = row - 1; i >= 0; i--) {
                printDiagonalOuter(arr, i, row - 1);
            }

        }

    }

    private static void printDiagonalOuter(int[][] arr, int srow, int col) {
        int j = 4;
        for (int i = srow; i <= col; i++) {
            System.out.println(" | " + arr[i][j] + " | ");
            j--;
        }
        System.out.println("=============================================================================DIAGONAL===================================================================================");
    }

    private static void printDiagonalInner(int[][] arr, int srow, int srow1) {
        int j = 0;
        for (int i = srow; i >= 0; i--) {
            System.out.println(arr[j][i]);
            j++;
        }
        System.out.println("=============================================================================DIAGONAL===================================================================================");

    }
//    private static void printAllRightToleftDiagonal(int[][] arr) {
//        int right = arr.length;
//        int left = arr[0].length;
////        int i = 0;
////        int j = left - 1;
//        for (int j = left - 1; j >= 0; j--) {
//            int k = j;
//            for (int i = 0; i < right; i++) {
//                System.out.println("   |  " + arr[i][k] + " | ");
//                k--;
//            }
//            System.out.println("=============================================================================DIAGONAL===================================================================================");
//
//        }
//
//    }

}

