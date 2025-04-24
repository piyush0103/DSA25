package coder25.problemSolving1.Arrays.carryForward;

import java.util.Arrays;
import java.util.HashMap;

public class CountgiousEqual01 {
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 1, 1, 1, 0, 0, 0};
        System.out.println(findMinLensubArrray(arr));
    }

    private static int findMinLensubArrray(int[] arr) {
        int sum = 0;
        int start = 0;
        int len = 0;
        int max_len = Integer.MIN_VALUE;
        int end = 0;
        int prefix[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? -1 : arr[i];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                end = map.get(sum);
               max_len= Math.max(max_len, (i - end));
            } else {
                map.put(sum, i);
            }
        }
        System.out.println(map + " heyy");
        return max_len;
    }
}

