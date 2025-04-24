package coder25.problemSolving1.Arrays.slidingWindow;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class MaximumSubArrayOfDistinctElem {
    public static void main(String[] args) {
        int arr[] = {1,1,1,7,8,9};
        int k = 3;
        long max_sum = findMaximumSubArray(arr, k);
//        HashSet<Integer> duplicateHash = new HashSet<>();
//        duplicateHash.add(25);
        System.out.println(max_sum + " All Distinct  ");

    }

    private static long findMaximumSubArray(int[] arr, int k) {
        HashSet<Integer> duplicateHash = new HashSet<>();
        long maxSum = Integer.MIN_VALUE;
        int start = 0;
        long curr_sum = 0;
        if (arr.length < k) {
            return 0;
        }
        for (int end = 0; end < arr.length; end++) {

            if (!duplicateHash.contains(arr[end])) {
                duplicateHash.add(arr[end]);
                curr_sum += arr[end];
                if ((end - start + 1) == k) {
                    maxSum = Math.max(curr_sum, maxSum);
                    duplicateHash.remove(arr[start]);
                    curr_sum -= arr[start];
                    start++;
                }

            } else {
                while(arr[start]!=arr[end]){
                    curr_sum -=arr[start];
                    duplicateHash.remove(arr[start]);
                    start++;
                }
                start++;
                duplicateHash.add(arr[end]);


            }

        }
        return maxSum==Integer.MIN_VALUE?0:maxSum;

    }
}

