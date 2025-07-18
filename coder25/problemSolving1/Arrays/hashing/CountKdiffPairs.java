package coder25.problemSolving1.Arrays.hashing;

import java.util.HashSet;
import java.util.Set;

public class CountKdiffPairs {
    public static void main(String[] args) {
        int arr[] = {3, 1, 4, 1, 5};
        int k = 2;
        System.out.println(findCountKDiffPair(arr, k));
    }

    private static int findCountKDiffPair(int[] arr, int k) {
        int count = 0;
        Set<Integer> uniqueSet = new HashSet<>();
        Set<Integer> repeatSet = new HashSet<>();
        for (int x : arr) {
            if (uniqueSet.contains(x)) {
                repeatSet.add(x);
            } else {
                uniqueSet.add(x);
            }
        }
        if (k == 0) {
            return repeatSet.size();
        }
        for (int x : uniqueSet) {
            if (uniqueSet.contains(x + k)) {
                count++;
            }
        }
        return count;
    }
}
