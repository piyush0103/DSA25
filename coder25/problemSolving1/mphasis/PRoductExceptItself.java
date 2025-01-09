package coder25.problemSolving1.mphasis;

import java.util.Arrays;

public class PRoductExceptItself {
    public static void main(String[] args) {
   int arr[]={-1,1,0,-3,3};
  int result[]=productExceptSelf(arr);
        System.out.println(Arrays.toString(result));
    }


    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int pro = 1;
        for(int i : nums) {
            pro *= i;
        }

        for(int i = 0; i < n; i++) {
            ans[i] = pro / nums[i];
        }
        return ans;
    }
}

