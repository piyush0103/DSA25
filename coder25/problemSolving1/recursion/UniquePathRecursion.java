package coder25.problemSolving1.recursion;

import java.util.Arrays;

public class UniquePathRecursion {
    public static void main(String[] args) {
        int m = 3, n = 3;
        int aboveRow[] = new int[n];
        int currentCol[] = new int[n];
        Arrays.fill(currentCol, 1);
        Arrays.fill(aboveRow, 1);
        System.out.println(finduniquePathRec(m, n, aboveRow, currentCol, 1, 1) + "    hmmmm pnhysics...!");
    }

    private static int finduniquePathRec(int m, int n, int[] aboveRow, int[] currentCol, int row, int col) {
        if (row == m ) {
            return aboveRow[n - 1];
        }
        currentCol[col] = currentCol[col - 1] + aboveRow[col];
        if (col == n - 1) {
            System.out.println(Arrays.toString(currentCol));
            aboveRow = currentCol;
            col = 0;
            row++;
            currentCol = new int[n];
            Arrays.fill(currentCol, 1);
        }
        return finduniquePathRec(m, n, aboveRow, currentCol, row, col + 1);

    }
}
