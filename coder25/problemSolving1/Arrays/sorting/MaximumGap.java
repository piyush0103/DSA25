package coder25.problemSolving1.Arrays.sorting;

import java.util.Arrays;

public class MaximumGap {
    public static void main(String[] args) {
int arr[]={3,6,156,1};
int max_gap=findmaxGap(arr);
        System.out.println(max_gap+" hre re");
    }

    private static int findmaxGap(int[] arr) {
        Arrays.sort(arr);
       int max=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            max=Math.max(max,Math.abs(arr[i-1]-arr[i]));
        }
        return max;
    }
}
