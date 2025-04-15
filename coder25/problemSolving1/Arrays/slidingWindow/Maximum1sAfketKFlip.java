package coder25.problemSolving1.Arrays.slidingWindow;

public class Maximum1sAfketKFlip {
    public static void main(String[] args) {
        int arr[]={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k=3;
        System.out.println(longestOnes(arr,k));
    }
    public static int longestOnes(int[] nums, int k) {
        int left = 0, maxLength = 0, zeroCount = 0;
        for (int right = 0; right < nums.length; ++right) {
            if (nums[right] == 0) {
                zeroCount++;
            }
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}

