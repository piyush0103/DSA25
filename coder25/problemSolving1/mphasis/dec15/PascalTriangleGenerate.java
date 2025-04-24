package coder25.problemSolving1.mphasis.dec15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangleGenerate {
    public static void main(String[] args) {
        List<List<Integer>> pascal = generate(3);
        System.out.println(pascal);
        System.out.println(getPascalPosition(pascal,2,1));
    }

    private static int getPascalPosition(List<List<Integer>> pascal, int i, int j) {
        if (i <= j) {
            return -1;
        }
        return pascal.get(i - 1).get(j - 1);
    }


    public static List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList<>();
        if (numRows == 1) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(Arrays.asList(1));
            return result;
        }
        List<List<Integer>> prevRows = generate(numRows - 1);
        List<Integer> newRow = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            newRow.add(1);
        }
        for (int i = 1; i < numRows - 1; i++) {
            newRow.set(i, prevRows.get(numRows - 2).get(i - 1) + prevRows.get(numRows - 2).get(i));
        }
        prevRows.add(newRow);
//        System.out.println(prevRows+"  ooko");
        return prevRows;
    }
}