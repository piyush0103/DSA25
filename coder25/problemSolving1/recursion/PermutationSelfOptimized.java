package coder25.problemSolving1.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationSelfOptimized {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        List<List<Integer>> permutaion = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean used[] = new boolean[arr.length];
//        System.out.println(Arrays.toString(used)+ "ss");
        permuteBackTracking(arr, permutaion, list, used);
        System.out.println(permutaion + " ahoy");
    }

    private static void permuteBackTracking(int[] arr, List<List<Integer>> permutaion, List<Integer> temp, boolean[] used) {
        if (temp.size() == arr.length) {
            permutaion.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (used[i] == true) {
                continue;
            }
            temp.add(arr[i]);
            used[i]=true;
            permuteBackTracking(arr, permutaion, temp, used);
            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }
}
