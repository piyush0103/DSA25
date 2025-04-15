package coder25.problemSolving1.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationWithDuplicateNoBackTrackingOPtimized {
    public static void main(String[] args) {
        int arr[] = {1, 1, 3};
        List<List<Integer>> permutaion = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean used[] = new boolean[arr.length];
        Arrays.sort(arr);
        permuteBackTrackingDuplicateOpt(arr, permutaion, list, used);
        System.out.println(permutaion + " ahoy");
    }

    private static void permuteBackTrackingDuplicateOpt(int[] arr, List<List<Integer>> permutaion, List<Integer> list, boolean[] used) {
        if (arr.length == list.size()) {
            permutaion.add(new ArrayList<>(list));
        }
        for (int i = 0; i < arr.length; i++) {
            if (used[i] || i > 0 && arr[i] == arr[i - 1] && !used[i - 1]) {
                continue;

            }
            list.add(arr[i]);
            used[i] = true;
            permuteBackTrackingDuplicateOpt(arr, permutaion, list, used);
            list.remove(list.size() - 1);
            used[i] = false;
        }
    }
}
