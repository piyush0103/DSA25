package coder25.problemSolving1.maths;

import coder25.problemSolving1.mphasis.dec10.GCDOfTwoNo;

public class GCD {
    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 9, 10};
        System.out.println(findGCD(arr));
    }

    private static int findGCD(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return gcd(min, max);

    }

    private static int gcd(int min, int max) {
        if (max == 0) {
            return min;
        }
        return gcd(max, min % max);
    }
}
