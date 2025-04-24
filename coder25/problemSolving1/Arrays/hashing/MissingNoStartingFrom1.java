package coder25.problemSolving1.Arrays.hashing;

import java.util.ArrayList;
import java.util.List;

public class MissingNoStartingFrom1 {
    public static void main(String[] args) {
        int num[] = {4, 3, 2, 7, 8, 2, 3, 1};
        ArrayList miss = (ArrayList) findMissing(num);
        System.out.println(miss);
    }

    private static List findMissing(int[] num) {
        int idx = -1;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                idx = num[i] * -1 - 1;
            } else {
                idx = num[i] - 1;
            }
            if (num[idx] > 0) {
                num[idx] = -num[idx];
            }

        }
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                ls.add(i + 1);
            }
        }
        return ls;
    }
}
