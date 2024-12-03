package coder25.problemSolving1.Arrays.prefix;

import java.util.Arrays;

public class MaxConsecutiveonewith1Replace1ZeroPrefix {
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0};
        int maxConsecutiveZero = findMaxConsecutiveZero(arr, arr.length);
        System.out.println(maxConsecutiveZero + "  sol");
    }

    private static int findMaxConsecutiveZero(int[] arr, int length) {
        int prefix[] = new int[length];
        prefix[0] = arr[0];
        for (int i = 1; i < length; i++) {
            if (arr[i] != 0) {
                prefix[i] = prefix[i - 1] + arr[i];

            }
        }
        System.out.println(Arrays.toString(prefix) + " printing prefix");
        int left = 0;
        int right = 0;
        int maxones = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 1; i < length; i++) {
            sum = 0;
            if (arr[i] == 0) ;
            sum = prefix[i - 1];
            for (right = i + 1; right < length; right++) {
                if (arr[right] == 1) {
                    sum++;
                } else {
                    break;
                }
            }
            maxones = Math.max(maxones, (sum + 1));

        }
        return maxones;
    }
}

