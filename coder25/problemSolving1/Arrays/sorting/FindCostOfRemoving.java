package coder25.problemSolving1.Arrays.sorting;

import java.util.Arrays;

public class FindCostOfRemoving {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 4};
        System.out.println(optmumCost(arr));
    }

    private static int optmumCost(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int cost = 0;
        for (int i = n - 1; i >= 0; i--) {
            cost += arr[i] * (n - i);

        }
        return cost;
    }
}
