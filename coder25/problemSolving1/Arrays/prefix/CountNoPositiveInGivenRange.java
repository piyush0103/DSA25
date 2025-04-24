package coder25.problemSolving1.Arrays.prefix;

import java.util.Arrays;

public class CountNoPositiveInGivenRange {
    public static void main(String[] args) {
        int A[] = {5, 2, -9, 7, -6, 9, 4, -6, -3, -7, 55};
        int query[][] = {{0, 2}, {2, 3}, {1, 5}};
        int prefix[] = new int[A.length];
        prefix[0] = A[0] > 0 ? 1 : 0;
        for (int i = 1; i < A.length; i++) {
            prefix[i] = prefix[i - 1] + (A[i] >= 0 ? 1 : 0);
        }
        int left = 0;
        int right = 0;
        for (int i = 0; i < query.length; i++) {
            left = query[i][0];
            right = query[i][1];
            int result = left == 0 ? prefix[right] : prefix[right] - prefix[left - 1];
            System.out.println("day :: " + left + "   to  day " + right + " = " + result);
        }
    }
}
