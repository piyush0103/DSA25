package coder25.problemSolving1.bitManipulation;

import java.util.Arrays;

public class SingleNumber3 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 2, 5};
        int dist[] = findTwoDistinct(arr);
        System.out.println(Arrays.toString(dist));

    }

    private static int[] findTwoDistinct(int[] arr) {
        int resNum = 0;
        int p = 0, q = 0;
        for (int x : arr) {
            resNum ^= x;
        }
        resNum = resNum & (~(resNum - 1));
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & resNum) == 0) {
                p ^= arr[i];
            } else {
                q ^= arr[i];
            }

        }
        return new int[]{p, q};
    }
}
