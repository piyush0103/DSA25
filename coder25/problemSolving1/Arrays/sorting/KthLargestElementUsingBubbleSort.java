package coder25.problemSolving1.Arrays.sorting;

public class KthLargestElementUsingBubbleSort {
    public static void main(String[] args) {
        int nums[] = {3,2,3,1,2,4,5,5,6};
        int k = 4;
//        int x = findKthLargestElement(arr, k);
        int x = findKthLargestBubbleSort(nums, k);
        System.out.println(x + " is this the answer bro");
    }

    private static int findKthLargestBubbleSort(int[] nums, int k) {
        int n = nums.length;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if (nums[j] > nums[j + 1]) {
                    nums[j] += nums[j + 1];
                    nums[j + 1] = nums[j] - nums[j + 1];
                    nums[j] -= nums[j + 1];
                }
            }
            if (i == k - 1) {
                ans = nums[nums.length - k];
                break;
            }

        }
        return ans;
    }
}
