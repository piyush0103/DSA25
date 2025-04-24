package coder25.problemSolving1.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationRecBackTrackingOPtimized {
    public static void main(String[] args) {
        int arr[] = {2, 3, 6, 7};
        int target = 7;
        int sum = 0;
        List<List<Integer>> comb = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int freq[] = new int[41];
        combinationSumRecbackTrackingOpt(arr, target, comb, temp, sum, 0);
        System.out.println(comb + " ahoy");
    }

    private static void combinationSumRecbackTrackingOpt(int[] arr, int target, List<List<Integer>> comb, List<Integer> temp, int sum, int start) {
        if (target - sum < 0) {
            return;
        }
        else if (target - sum == 0) {
            comb.add(new ArrayList<>(temp));
        }
        else {
            for (int i = start; i < arr.length; i++) {
                temp.add(arr[i]);
                sum += arr[i];
                combinationSumRecbackTrackingOpt(arr, target, comb, temp, sum, i);
                temp.remove(temp.size() - 1);
                sum-=arr[i];
            }
        }
    }
}
