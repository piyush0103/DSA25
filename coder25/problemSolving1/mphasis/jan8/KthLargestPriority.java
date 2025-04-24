package coder25.problemSolving1.mphasis.jan8;

import java.util.PriorityQueue;

public class KthLargestPriority {
    public static void main(String[] args) {
        int arr[] = {78, 5, 6, 9, 4, 1, 23, 5};
        int k = 3;
        int ans = findKthLargest(arr, k);
        System.out.println("Kth largest elem " + ans);
    }

    private static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            minHeap.offer(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
            if (nums[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }

        return minHeap.peek();
    }
}