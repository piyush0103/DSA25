package coder25.problemSolving1.Arrays.subArrays;

public class MaximumSubArray {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = new MaximumSubArray().maxSubArray(arr);
        System.out.println(sum);
    }

    public int maxSubArray(int[] nums) {
        int mx_sum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            mx_sum=Math.max(sum,mx_sum);

            if(sum<0){
                sum=0;
            }
        }
        return mx_sum;
    }
}
