package coder25.problemSolving1.Arrays.hashing;

import java.util.HashMap;
import java.util.Map;

public class CountSubArrayWithSumK {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1};
        int sum = 2;
        System.out.println(subArraysExist2(arr, sum));
    }

    private static int subArraysExist2(int[] arr, int sum) {
        int add = 0;
        int count = 0;
        Map<Integer, Integer> hash = new HashMap<>();
        hash.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            add += arr[i];
            if (hash.containsKey(add - sum)) {
                count += hash.get(add - sum);
            }
            hash.put(add, hash.getOrDefault(add, 0) + 1);

        }
        return count;
    }
}

