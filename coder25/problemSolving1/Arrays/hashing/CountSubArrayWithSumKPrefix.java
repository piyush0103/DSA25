package coder25.problemSolving1.Arrays.hashing;

import java.util.HashMap;

public class CountSubArrayWithSumKPrefix {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1};
        int sum = 2;
        System.out.println(subArraysExistPrefix(arr, sum));
    }

    private static int subArraysExistPrefix(int[] arr, int k) {
            int count = 0;
            int prefix[] = new int[arr.length];
            HashMap<Integer, Integer> hash = new HashMap<>();
            prefix[0] = arr[0];
            for (int i = 1; i < arr.length; i++) {
                prefix[i] = prefix[i - 1] + arr[i];
            }
            for (int i = 0; i < arr.length; i++) {
                if (prefix[i] == k) {
                    count++;
                }
                int sub = prefix[i] - k;
                if (hash.containsKey(sub)) {
                    count += hash.get(sub);
                }
                hash.put(prefix[i], hash.getOrDefault(prefix[i], 0) + 1);

            }
            return count;
        }
    }
