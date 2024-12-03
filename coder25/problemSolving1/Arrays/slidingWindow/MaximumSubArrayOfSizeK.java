package coder25.problemSolving1.Arrays.slidingWindow;

//Given an array of length find the subarray of length k with greatest sum
public class MaximumSubArrayOfSizeK {
    public static void main(String[] args) {
        int arr[] = {0, 7, 2, 3, 1, 2, 4, 3,8,9,7};
        int len = 4;
        int start = 0;
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        if (arr.length < len)
        {
            System.out.println("Invalid");

        }
        for (int end = 0; end < arr.length; end++) {
            curr_sum += arr[end];
            if ((end - start + 1) == len) {
                max_sum = Math.max(max_sum, curr_sum);
                System.out.println("max_sum :: " + max_sum + "  start :: " + start + "  end::" + end);
                curr_sum -= arr[start++];
            }

        }
        System.out.println("Max sum= " + max_sum);
    }
}
