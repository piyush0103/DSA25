package coder25.problemSolving1.Arrays.hashing;

import java.util.HashMap;

public class LongestSubArrayWithSum0 {
    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(findTheLongestSubArraywithsum0(arr));
    }

    private static int findTheLongestSubArraywithsum0(int[] arr) {
        int len = 0;
        int maxlen = 0;
        int prefix[] = new int[arr.length];
        HashMap<Integer, Integer> hash = new HashMap<>();
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (prefix[i] == 0) {
                len = i + 1;
            }
            if (hash.containsKey(prefix[i])) {
                len = i - hash.get(prefix[i]);
            }
            if (!hash.containsKey(prefix[i])) {
                hash.put(prefix[i], i);
            }
            maxlen = Math.max(maxlen, len);
        }
        return maxlen;
    }
}
