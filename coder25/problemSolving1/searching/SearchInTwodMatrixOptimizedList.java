package coder25.problemSolving1.searching;

import java.util.ArrayList;
import java.util.List;

public class SearchInTwodMatrixOptimizedList {
    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();
        List list1 = new ArrayList<>();
        List list2 = new ArrayList<>();
        List list3 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list3.add(7);
        list3.add(8);
        list3.add(9);
        matrix.add(list1);
        matrix.add(list2);
        matrix.add(list3);
        System.out.println(search2DMatrix(matrix, 5));

    }

    private static boolean search2DMatrix(List<List<Integer>> matrix, int target) {
        int n = matrix.size();
        int m = matrix.get(0).size();
        int low = 0;
        int high = n * m - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = mid / n;
            int col = mid % n;
            if (matrix.get(row).get(col) == target) {
                return true;
            }
            if (matrix.get(row).get(col) < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
