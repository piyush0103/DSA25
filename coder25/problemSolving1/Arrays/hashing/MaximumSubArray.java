package coder25.problemSolving1.Arrays.hashing;

public class MaximumSubArray {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));

    }

    private static int maxSubArray(int[] arr) {
        int maxSum=Integer.MIN_VALUE;;
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>maxSum){
                maxSum=sum;
            }if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }
}
