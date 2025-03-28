package coder25.problemSolving1.bitManipulation;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int arr[] = {1,2,3,};
        System.out.println(findAllSubSet(arr));

    }

    private static List<List<Integer>> findAllSubSet(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    subset.add(nums[j]);
                }
            }
            System.out.println(subset+" ahoy");
            result.add(subset);
        }
        return result;
    }
}

