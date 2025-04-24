package coder25.problemSolving1.Arrays.slidingWindow;

public class PivotIndex {
    public static void main(String[] args) {
        int input[] = {1, 7, 3, 6, 5, 6};
//        brute force approach
//        int index = new PivotIndex().pivotIndex(input);
//        System.out.println("pivot index " + index);
//    optimal approach
        int index2 = new PivotIndex().pivotIndex2(input);
        System.out.println("pivot index " + index2);

    }

    private int pivotIndex2(int[] nums) {
        int rsum = 0;
        int pivot = -1;
        int lsum = 0;
        for (int x :nums) {
            rsum += x;
        }
        for (int j = 0; j < nums.length; j++) {
            rsum = rsum - nums[j];
            if (lsum == rsum) {
                pivot = j;
                break;
            }
            lsum += nums[j];
        }
        return pivot;
    }

    public int pivotIndex(int[] nums) {
        int pivot = -1;
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 1; i < nums.length; i++) {
            leftSum = findSum(nums, 0, i);
            rightSum = findSum(nums, i + 1, nums.length);
            System.out.println("coming " + leftSum + "   " + rightSum);
            if (leftSum == rightSum) {
                pivot = i;
                System.out.println("coming hwre");
                break;
            }
        }
        return pivot;
    }

    private int findSum(int[] nums, int i, int i1) {
        int rsum = 0;
        for (int j = i; j < i1; j++) {
            rsum += nums[i];
        }
        return rsum;
    }
}
