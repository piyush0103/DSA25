package coder25.problemSolving1.Arrays;

import java.util.*;

public class ZeroOneMatrixBC {
    public static void main(String[] args) {
        List<List<Integer>> listOfList = new ArrayList<>();
        listOfList.add(Arrays.asList(new Integer[]{0, 0, 0}));
        listOfList.add(Arrays.asList(new Integer[]{0, 1, 0}));
        listOfList.add(Arrays.asList(new Integer[]{1, 1, 1}));
        solve(listOfList);
    }

    static class Pair {
        int rowX;
        int columnY;

        @Override
        public String toString() {
            return "Pair{" +
                    "rowX=" + rowX +
                    ", columnY=" + columnY +
                    '}';
        }

        public Pair(int left, int right) {
            this.rowX = left;
            columnY = right;
        }
    }

    static int[][] dist = null;

    public static List<List<Integer>> solve(List<List<Integer>> input) {
        int convertMatrix[][] = new int[input.size()][];
        int i = 0, j = 0;
        for (List<Integer> listOfList : input) {
            convertMatrix[i] = listOfList.stream().mapToInt(Integer::intValue).toArray();
            i++;
        }
        printArray(convertMatrix);
        int row = convertMatrix.length;
        int column = convertMatrix[0].length;
        dist = new int[row][column];
        findNearestDistance(convertMatrix, row, column);
//        return dist;
        List<List<Integer>> listOfList = new ArrayList<>();
        for (int oneD[] : dist) {
            listOfList.add(Arrays.stream(oneD).boxed().toList());
        }
        printList(listOfList);
        return listOfList;
    }

    private static void printList(List<List<Integer>> listOfList) {
        System.out.println("PRINTING 2d matrix  : FROM LIST");
        for (List<Integer> list : listOfList) {
            for (Integer x : list) {
                System.out.print(x + " | ");
            }
            System.out.println();
        }

    }

    private static void printArray(int[][] convertMatrix) {
        System.out.println("PRINTING 2d matrix :");
        for (int i = 0; i < convertMatrix.length; i++) {
            for (int j = 0; j < convertMatrix[0].length; j++) {
                System.out.print(convertMatrix[i][j] + " | ");
            }
            System.out.println();
        }
    }

    private static void findNearestDistance(int[][] mat, int row, int column) {
        int xc[] = {-1, 0, 1, 0};
        int yc[] = {0, -1, 0, 1};
        Queue<Pair> queue = new ArrayDeque<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                dist[i][j] = Integer.MAX_VALUE - 1000;
                if (mat[i][j] == 0) {
                    dist[i][j] = 0;
                    queue.add(new Pair(i, j));
                }
            }
        }
//        System.out.println(queue);
//        printArray(dist);
        Pair popped;
        while (!queue.isEmpty()) {
            popped = queue.peek();
//            System.out.println(popped);
            queue.remove();
            int x = popped.rowX;
            int y = popped.columnY;
            for (int i = 0; i < 4; i++) {
                int adjx = x + xc[i];
                int adjy = y + yc[i];
                if (adjx >= 0 && adjx < row && adjy >= 0 && adjy < column && dist[adjx][adjy] > dist[x][y] + 1) {
                    System.out.println(dist[adjx][adjy]);
                    dist[adjx][adjy] = dist[x][y] + 1;
                    queue.add(new Pair(adjx, adjy));

                }
            }

        }

    }
}