package coder25.problemSolving1.mphasis;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumIndices {
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int target = -2;
        int found[] = findTwoSums(arr, target);
        System.out.println(Arrays.toString(found));
    }

    public static int[] findTwoSums(int[] nums, int target) {
    Map<Integer, Integer> numMap = new HashMap<>();
    int n = nums.length;


        for (int i = 0; i < n; i++) {
        numMap.put(nums[i], i);
    }

        for (int i = 0; i < n; i++) {
        int complement = target - nums[i];
        if (numMap.containsKey(complement) && numMap.get(complement) != i) {
            return new int[]{i, numMap.get(complement)};
        }
    }

        return new int[]{};
}
}
