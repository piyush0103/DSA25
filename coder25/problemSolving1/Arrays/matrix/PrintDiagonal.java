package coder25.problemSolving1.Arrays.matrix;

public class PrintDiagonal {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        print2DMAtrix(arr);
        System.out.println("====================================================================================");
        printDiagonal(arr);
    }

    public static void printDiagonal(int[][] arr) {
        printLeftRightDiagonal(arr);
        printRightLeftDiagonal(arr);

    }

    private static void printRightLeftDiagonal(int[][] arr) {
        int j = arr[0].length-1;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" | " + arr[i][j]);
            j--;
        }

    }

    private static void printLeftRightDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" | " + arr[i][i]);

        }
        System.out.println(" | ");

    }


    public static void print2DMAtrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(" | " + arr[i][j]+" | ");

            }
            System.out.println();

        }
    }
}
