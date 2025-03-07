package coder25.problemSolving1.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateMissingNoInSetUsingSum {
    public static void main(String[] args) {
        int num[] = {2, 2};
        int dupM[] = findDupMissing(num);
        System.out.println(Arrays.toString(dupM));
    }

    private static int[] findDupMissing(int[] num) {
        int n = num.length;
        int sum = n * (n + 1) / 2;
        int actualSum = 0;
        int expectedSum = 0;
        Set<Integer> uni = new HashSet<Integer>();
        for (int x : num) {
            actualSum += x;
        }
        for (int x : num) {
            uni.add(x);
        }
        for (int x : uni) {
            expectedSum += x;
        }
        int miss = sum - expectedSum;
        int dup = actualSum - expectedSum;
        int arr[] = new int[2];
        arr[0] = dup;
        arr[1] = miss;
        return arr;
    }
}
