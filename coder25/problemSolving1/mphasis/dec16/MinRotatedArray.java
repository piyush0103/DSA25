package coder25.problemSolving1.mphasis.dec16;

public class MinRotatedArray {
    public static void main(String[] args) {
        int arr[] = {};
        System.out.println(new MinRotatedArray().findMin(arr));
    }

    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }
}

