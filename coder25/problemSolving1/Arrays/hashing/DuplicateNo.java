package coder25.problemSolving1.Arrays.hashing;

import java.util.Arrays;

public class DuplicateNo {
    public static void main(String[] args) {
        int num[] = {2, 2};
        int dupM = findDupMissing(num);
        System.out.println(dupM);
    }

    private static int findDupMissing(int[] num) {
        int n = num.length;
        int hashed[] = new int[n + 1];
        int dup = -1;
        for (int i = 0; i < n; i++) {
            hashed[num[i]]++;

        }
        for (int i = 0; i < hashed.length; i++) {
            if (hashed[i] >= 2) {
                dup = i;
                break;
            }
        }
        return dup;
    }

}

