package coder25.problemSolving1.Arrays.slidingWindow;

import coder25.problemSolving1.Arrays.matrix.PrintDiagonal;

import java.util.Scanner;

public class GenerateSpriralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter square matrix :");
        int x = sc.nextInt();
        System.out.println(" you entered " + x);
       int mat[][]= generateSquareMatrix(x);
        PrintDiagonal.print2DMAtrix(mat);
    }

    private static int[][] generateSquareMatrix(int x) {
        int mat[][] = new int[x][x];
        int i = 0, j = 0;
        int counter = 1;
        while (x > 0) {
            for (int k = j; k < x; k++) {
                mat[i][j] = counter++;
                j++;
            }
            i++;
            for (int k = i; k < x; k++) {
                mat[i][j] = counter++;
                i++;
            }
            j--;
            for (int k = j; k >=0; k--){
                mat[i][j] = counter++;
                j--;
            }
            i++;
            for (int k = i; k >=0 ; k--) {
                mat[i][j] = counter++;
                i--;
            }
            j++;
            if(x == 1) {
                mat[i][j] = counter;
            }
            x = x - 2;
            i++;
            j++;
        }
        return mat;
    }
}
