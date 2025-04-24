package coder25.problemSolving1.Arrays.hashing;

import java.util.Arrays;

public class MissingNoUsingSum {
    public static void main(String[] args) {
        int num[] = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int n = num.length;
        int sum = n * (n + 1) / 2;
        int mSum = Arrays.stream(num).sum();
        System.out.println((sum-mSum)+" missing no");

    }
}
