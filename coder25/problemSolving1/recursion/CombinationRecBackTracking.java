package coder25.problemSolving1.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationRecBackTracking {
    public static void main(String[] args) {
        int arr[] = {2, 3, 6, 7};
        int target = 7;
        int sum = 0;
        List<List<Integer>> comb = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        combinationSumRecbackTracking(arr, target, comb, temp, sum, 0);
        System.out.println(comb + " ahoy");
    }

    private static void combinationSumRecbackTracking(int[] arr, int target, List<List<Integer>> comb, List<Integer> temp, int sum, int start) {
        if (sum == target) {
            comb.add(new ArrayList<>(temp));
            return;
        }
        if (sum > target) {
            return;
        }
        for (int i = start; i < arr.length; i++) {
            if (target - sum % arr[i] == 0) {
                temp.add(arr[i]);
                sum += arr[i];
                combinationSumRecbackTracking(arr, target, comb, temp, sum, i);
            } else {
                temp.add(arr[i]);
                sum += arr[i];
                combinationSumRecbackTracking(arr, target, comb, temp, sum, i);
                temp.remove(temp.size() - 1);
                sum -= arr[i];
            }
        }
    }
}
