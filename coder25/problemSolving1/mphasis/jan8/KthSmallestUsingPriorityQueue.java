package coder25.problemSolving1.mphasis.jan8;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthSmallestUsingPriorityQueue {
    public static void main(String[] args) {
        int arr[] = {5, 20, 10, 7, 1};
        int k = 1;
        int ans = findThekthSmallest(arr, k);
        System.out.println("Kth smallest element " + ans);
    }

    private static int findThekthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((num1, num2) -> num1 - num2);
        if (arr.length > 0 && arr != null) {
            for (int i = 0; i < arr.length; i++) {
                heap.add(arr[i]);
                if (heap.size() > k) {
                    heap.remove();
                }
            }
            return heap.peek();
        }
        return -1;
    }
}
