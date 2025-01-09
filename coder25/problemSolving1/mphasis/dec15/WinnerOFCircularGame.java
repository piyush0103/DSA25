package coder25.problemSolving1.mphasis.dec15;

import java.util.ArrayList;
import java.util.List;

public class WinnerOFCircularGame {
    public static void main(String[] args) {
        int n = 7;
        int k = 2;
        int winnerIndex = fingWinner(n, k);
        System.out.println("print winner index " + winnerIndex);
    }

    private static int fingWinner(int n, int k) {
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }
        int startIndex = 0;
        while (list.size() != 1) {
            int removeIndex = (startIndex + k - 1) % list.size();
            list.remove(removeIndex);
            startIndex = removeIndex;
        }
        return list.get(0);
    }
}

