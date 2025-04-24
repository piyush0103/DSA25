package coder25.problemSolving1.recursion.retry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationBackTrackingContainsDuplicate {
    public static void main(String[] args) {
        int arr[] = {1, 1, 3,};
        List<List<Integer>> permutation = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean used[] = new boolean[arr.length];
        Arrays.sort(arr);
        permutationBackTrackingDup(arr, permutation, temp, 0, used);
        System.out.println(permutation + " oh ok");
    }

    private static void permutationBackTrackingDup(int[] arr, List<List<Integer>> permutation, List<Integer> temp, int start, boolean[] used) {
        if (temp.size() == arr.length) {
            permutation.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (used[i] == true || (i > start && arr[i] == arr[i - 1]) && used[i - 1]) {
                continue;
            }
            temp.add(arr[i]);
            used[i] = true;
            permutationBackTrackingDup(arr, permutation, temp, start, used);
            temp.remove(temp.size() - 1);
            used[i] = false;

        }
    }
}


