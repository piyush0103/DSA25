package coder25.problemSolving1.recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationWithDuplicateNoBackTracking {
    public static void main(String[] args) {
        int arr[] = {1, 1, 3};
        List<List<Integer>> permutaion = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean used[] = new boolean[arr.length];
        permuteBackTrackingDuplicate(arr, permutaion, list, used);
        System.out.println(permutaion + " ahoy");
    }

    private static void permuteBackTrackingDuplicate(int[] arr, List<List<Integer>> permutaion, List<Integer> list, boolean[] used) {
        if (list.size() == arr.length&& !permutaion.contains(list)) {
            permutaion.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if ( used[i]==true) {
                continue;
            }
            list.add(arr[i]);
            used[i] = true;
            permuteBackTrackingDuplicate(arr, permutaion, list, used);
            list.remove(list.size() - 1);
            used[i]=false;
        }
    }
}
