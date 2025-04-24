package coder25.problemSolving1.mphasis;

import java.util.Arrays;

public class ProductItSelfWithoutSpace {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    public  static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for(int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        System.out.println(Arrays.toString(ans));
        curr = 1;
        for(int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }
}

