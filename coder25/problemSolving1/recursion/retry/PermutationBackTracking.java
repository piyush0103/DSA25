package coder25.problemSolving1.recursion.retry;

import java.util.ArrayList;
import java.util.List;

public class PermutationBackTracking {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3,};
        List<List<Integer>> permutation = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean used[] = new boolean[arr.length];
        permutationBackTracking(arr, permutation, temp, 0, used);
        System.out.println(permutation + " oh ok");
    }

    private static void permutationBackTracking(int[] arr, List<List<Integer>> permutation, List<Integer> temp, int start, boolean[] used) {
        if (temp.size() == arr.length) {
            permutation.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (used[i] == false) {
                temp.add(arr[i]);
                used[i] = true;
                permutationBackTracking(arr, permutation, temp, start, used);
                temp.remove(temp.size() - 1);
                used[i] = false;
            }
        }
    }
}
