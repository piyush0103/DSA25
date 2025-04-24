package coder25.problemSolving1.mphasis.dec10;

import java.util.HashMap;
import java.util.Map;

public class CountSubArraySumK {
    public static void main(String[] args) {
        int arr[]={1,5,9,8,7,6,2};
        int k=6;
       int count= findSubArrayCount(arr,k);
        System.out.println(count);
    }

    private static int findSubArrayCount(int[] arr, int k) {
        int n = arr.length;
        Map<Integer,Integer> mpp = new HashMap<>();
        int preSum = 0, cnt = 0;
        mpp.put(0, 1);
        for (int i = 0; i < n; i++) {
            preSum += arr[i];
            int remove = preSum - k;
            cnt +=mpp.getOrDefault(remove, 0);
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }
}
