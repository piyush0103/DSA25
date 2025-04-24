package coder25.problemSolving1.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RatInAMaze {
    static String direction = "DURL";

    static int dr[] = {1, -1, 0, 0};
    static int dc[] = {0, 0, 1, -1};


    public static void main(String[] args) {
        Integer arr[][] = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}};
        List<List<Integer>> matrix = Arrays.stream(arr).map(Arrays::asList).collect(Collectors.toList());
        List<String> allPossiblePath = new ArrayList<>();
        findAllPossibleRatPath(matrix, 0, 0, allPossiblePath, new StringBuilder(""));
        System.out.println(allPossiblePath);

    }

    private static void findAllPossibleRatPath(List<List<Integer>> matrix, int row, int col, List<String> allPossiblePath, StringBuilder path) {
        if (row == matrix.size() - 1 && col == matrix.get(0).size() - 1 || matrix.get(row).get(col) <= 0) {
            allPossiblePath.add(new String(path));
            return;
        }
        matrix.get(row).set(col, -1);
        for (int i = 0; i < 4; i++) {
            int nextRow = row + dr[i];
            int nextCol = col + dc[i];
            if (nextRow >= 0 && nextCol >= 0 && nextRow < matrix.size() && nextCol < matrix.get(0).size() && matrix.get(nextRow).get(nextCol) == 1) {
                path.append(direction.charAt(i));
                findAllPossibleRatPath(matrix, nextRow, nextCol, allPossiblePath, path);
                path.deleteCharAt(path.length() - 1);
            }
        }
        matrix.get(row).set(col, 1);

    }

}
//if (row == 0) {
//        if (matrix.get(row + 1).get(col) == 1) {
//            matrix.get(row + 1).set(col, -1);
//            path += "D";
//            findAllPossibleRatPath(matrix, row + 1, col, allPossiblePath, path);
//        }
//    }
//        if (col == 0) {
//        if (matrix.get(row).get(col + 1) == 1) {
//            matrix.get(row + 1).set(col + 1, -1);
//            path += "R";
//            findAllPossibleRatPath(matrix, row, col + 1, allPossiblePath, path);
//
//        }
//    }
//        if (row <= matrix.size() - 1 && row > 0) {
//        if (matrix.get(row + 1).get(col) == 1) {
//            matrix.get(row + 1).set(col, -1);
//            path += "D";
//            findAllPossibleRatPath(matrix, row + 1, col, allPossiblePath, path);
//        }
//        if (matrix.get(row - 1).get(col) == 1) {
//            matrix.get(row - 1).set(col, -1);
//            path += "U";
//            findAllPossibleRatPath(matrix, row - 1, col, allPossiblePath, path);
//        }
//        if (col <= matrix.get(0).size() - 1 && col > 0) {
//            if (matrix.get(row).get(col + 1) == 1) {
//                matrix.get(row).set(col + 1, -1);
//                path += "R";
//                findAllPossibleRatPath(matrix, row + 1, col, allPossiblePath, path);
//            }
//            if (matrix.get(row).get(col - 1) == 1) {
//                matrix.get(row).set(col - 1, -1);
//                path += "L";
//                findAllPossibleRatPath(matrix, row - 1, col, allPossiblePath, path);
//            }
//        }
//    }
//}