package coder25.problemSolving1.mphasis;

public class MinimumSizeSubArray {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int minSize = new MinimumSizeSubArray().minSubArrayLen(target, arr);
        System.out.println(minSize+" result");
    }

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0, sum = 0;
        int ans = Integer.MAX_VALUE;
        for (right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                ans = Math.min(ans, right - left + 1);
                sum -= nums[left++];
            }

        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}

