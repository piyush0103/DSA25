package coder25.problemSolving1.recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationSelf {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        List<List<Integer>> permutaion = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        permuteBackTracking(arr, permutaion, list);
        System.out.println(permutaion+" ahoy");
    }

    private static void permuteBackTracking(int[] arr, List<List<Integer>> permutaion, List<Integer> temp) {
        if (temp.size() == arr.length) {
            permutaion.add(new ArrayList<>(temp));
        }
        for (int i = 0; i < arr.length; i++) {
            if (temp.contains(arr[i])) {
                continue;
            }
            temp.add(arr[i]);
            permuteBackTracking(arr, permutaion, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
