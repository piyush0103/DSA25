package coder25.problemSolving1.Arrays.hashing;

import java.util.Arrays;

public class MissingNo {
    public static void main(String[] args) {
        int num[] = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int x = findMissingNo(num);
        System.out.println(x + " is missing no");
    }

    private static int findMissingNo(int[] num) {
        int hash[] = new int[num.length + 1];
        Arrays.fill(hash, -1);
        for (int i = 0; i < num.length; i++) {
            hash[num[i]] = num[i];
        }
        for (int i = 0; i < num.length; i++) {
            if (hash[i] == -1) {
                return i;
            }
        }
        return -1;

    }
}
