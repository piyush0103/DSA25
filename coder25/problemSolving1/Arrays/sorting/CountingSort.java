package coder25.problemSolving1.Arrays.sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int nums[] = {7, 8, 9, 1, 5, 6, 4, 7, 19, 3, 6};
        System.out.println(Arrays.toString(nums) + "   before sort");
        System.out.println(Arrays.toString(countSort(nums, nums.length)) + "   after sort");

    }

    private static int[] countSort(int[] nums, int length) {
        int output[] = new int[length];
        int max = nums[0];
        for (int i : nums) {
            if (i > max) {
                max = i;
            }
        }
        int count[] = new int[max + 1];
        for (int i = 0; i < length; i++) {
            count[nums[i]]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        System.out.println(Arrays.toString(count) + "   cummulative");
        for (int i = length - 1; i >= 0; i--) {
            output[count[nums[i]] - 1] = nums[i];
            count[nums[i]]--;
        }
        return output;
    }
}
