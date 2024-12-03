package coder25.problemSolving1.Arrays.slidingWindow;

    //Given an array of positive integers nums and a positive integer target, return the minimal length of a
    //        subarray
    //        whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
    //
    //
    //
    //        Example 1:
    //
    //        Input: target = 7, nums = [2,3,1,2,4,3]
    //        Output: 2
    //        Explanation: The subarray [4,3] has the minimal length under the problem constraint.
    public class MinSubArray {
        public static void main(String[] args) {
            int arr[] = {2, 3, 1, 2, 4, 3};
            int target = 7;
            int shortestSubArr = new MinSubArray().minSubArrayLen(target, arr);
            System.out.println(shortestSubArr);
        }

        public int minSubArrayLen(int target, int[] nums) {
            int minSize = Integer.MAX_VALUE;
            int start = 0;
            int len = nums.length;
            int sum = 0;
            for (int right = 0; right < len; right++) {
                sum += nums[right];
                while (sum >= target) {
                    minSize = Math.min(((right - start) + 1), minSize);
                    sum -= nums[start++];
                }
            }
            return minSize != Integer.MAX_VALUE ? minSize : 0;
        }


    }
