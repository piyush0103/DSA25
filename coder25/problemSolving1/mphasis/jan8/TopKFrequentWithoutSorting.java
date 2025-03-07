package coder25.problemSolving1.mphasis.jan8;

import java.util.*;

public class TopKFrequentWithoutSorting {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int freq[] = findTopKFreq(arr, k);
        System.out.println(Arrays.toString(freq) + "  ok result" +
                "");
    }

    private static int[] findTopKFreq(int[] arr, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        List<Integer>[] hashMapping = new ArrayList[arr.length + 1];
        for (int i = 0; i < hashMapping.length; i++) {
            hashMapping[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int frequency = entry.getValue();
            int key = entry.getKey();
            hashMapping[frequency].add(key);
        }
        int idx = 0;
        int res[] = new int[k];
        for (int i = hashMapping.length - 1; i >= 0; i--) {
            for (int num : hashMapping[i]) {
                res[idx++] = num;
            }
            if (i == k) {
                return res;
            }
        }
        return res;
    }
}
