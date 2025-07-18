package coder25.problemSolving1.Arrays.hashing;

import java.util.Arrays;

public class TwoSum2SortedArray {
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int k = 9;
        System.out.println(Arrays.toString(findIndexOfTwoSumSorted(arr, k)));
    }

    private static int[] findIndexOfTwoSumSorted(int[] arr, int k) {
        int res[] = new int[2];
        int len = arr.length;
        if (len < 2) {
            return res;
        }
        int start = 0;
        int end = len - 1;
        int sum = 0;
        while (start < end) {
            sum = arr[start] + arr[end];
            if (sum == k) {
                res[0] = ++start;
                res[1] = ++end;
                return res;
            }
            if (sum < k) {
                start++;
            } else {
                end--;
            }
        }
        return res;
    }

}
