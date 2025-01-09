package coder25.problemSolving1.mphasis.jan8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class ReturnKLargest {
    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        List<Integer> res = kLargest(arr, k);
        for (int ele : res) {
            System.out.print(ele + " ");
        }
    }

    private static List<Integer> kLargest(int[] arr, int k) {
        PriorityQueue minHeap = new PriorityQueue();
        for (int i = 0; i < k; i++) {
            minHeap.offer(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if ((int) minHeap.peek() < arr[i]) {
                minHeap.poll();
                minHeap.offer(arr[i]);

            }
        }
        List<Integer> kLargest = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            kLargest.add((Integer) minHeap.poll());
        }
        Collections.reverse(kLargest);
        return kLargest;
    }

}
