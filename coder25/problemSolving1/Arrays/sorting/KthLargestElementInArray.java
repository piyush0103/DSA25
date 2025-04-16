package coder25.problemSolving1.Arrays.sorting;

import java.util.PriorityQueue;

public class KthLargestElementInArray {
    public static void main(String[] args) {
        int arr[] = {3,2,1,5,6,4};
        int k = 2;
        int x = findKthLargestElementBUbble(arr, k);
//        int x=findKthLargest(arr, k);
        System.out.println(x+" is this the answer bro");
    }

    private static int findKthLargestElementBUbble(int[] arr, int k) {
        if (arr.length < k || arr == null) {
            return -1;
        }
        if(arr.length==k){
           return arr[k-1];
        }
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] += arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] -= arr[j + 1];
                }

            }
            x++;
            if (arr.length - x == k) {
                break;
            }

        }
        return arr[x];
    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            minHeap.offer(nums[i]);
        }
        System.out.println(minHeap+" print");
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }

        return minHeap.peek();
    }
}

