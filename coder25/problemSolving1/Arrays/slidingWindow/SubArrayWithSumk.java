package coder25.problemSolving1.Arrays.slidingWindow;

import java.util.Arrays;

public class SubArrayWithSumk {
    public static void main(String[] args) {
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int target = 23;
        int coOrdinates[] = findSubArrayWithSumk(arr, target);
        System.out.println(Arrays.toString(coOrdinates) + " okaok");
    }

    private static int[] findSubArrayWithSumk(int[] arr, int target) {
        int s = 0, l = 0;
        int sum = 0;
        int res[] = {-1};
        for (int i = 0; i < arr.length; i++) {
            l = i;
            sum += arr[i];
            while (sum > target) {
                sum -= arr[s];
                s++;
            }
            if (sum == target) {
                res = new int[]{s + 1, l + 1};
                break;
            }
        }
        return res;
    }
}
