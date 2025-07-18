package coder25.problemSolving1.Arrays.hashing.twoPointers;

import java.util.Arrays;

public class KClosestElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int k=4;
        int x=3;
        int res[]=findKClosestElement(arr,k,x);
        System.out.println(Arrays.toString(res)+" heyyyy");
    }

    private static int[] findKClosestElement(int[] arr, int k, int x) {
        int res[]=new int[k];

        int start=0;
        int end=arr.length-1;
        while((end-start)>=k){
            if(Math.abs(x-arr[start])>Math.abs(arr[end]-x)){
                start++;
            }
            else{
                end--;
            }
        }
        System.out.println(start+":  "+end);
        int j=0;
        for(int i=start;i<=end;i++){

            res[j]=arr[i];
            j++;
        }
        return res;
    }
}
