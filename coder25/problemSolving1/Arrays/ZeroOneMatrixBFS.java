package coder25.problemSolving1.Arrays;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class ZeroOneMatrixBFS {
    static int MAX = 1000;

    // a node in queue
    static class pair {
        int first, second;

        pair(int f, int s) {
            first = f;
            second = s;
        }
    }

    // distance matrix which stores the distance of
    // nearest '1'
    static int[][] dist;

    public static void main(String[] args) {
        dist = new int[MAX][MAX];
        int mat[][] = {{0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}};
        int m = mat.length, n = mat[0].length;
        // Fills values in dist[][]
        // print distance matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" NEAREST 0");
        nearestOne(mat, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static void nearestOne(int[][] mat, int m, int n) {
        int newx[] = {-1, 0, 1, 0};
        int newy[] = {0, -1, 0, 1};
        Queue<pair> queue = new ArrayDeque<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j] = Integer.MAX_VALUE;
                if (mat[i][j] == 0) {
                    dist[i][j] = 0;
                    queue.add(new pair(i, j));
                }

            }
        }
        pair popped;
        while (!queue.isEmpty()) {
            popped = queue.peek();
            queue.remove();
            int x = popped.first;
            int y = popped.second;
            for (int i = 0; i < 4; i++) {
                int adjx = x + newx[i];
                int adjy = y + newy[i];
                if (adjx < m && adjx >= 0 && adjy >= 0 && adjy < n && dist[adjx][adjy] > dist[x][y] + 1) {
                    dist[adjx][adjy] = dist[x][y] + 1;
                    queue.add(new pair(adjx, adjy));
                }

            }

        }

    }
}