package coder25.problemSolving1.Arrays.slidingWindow;

public class MinimumSwaps2 {
    public static void main(String[] args) {
        int arr[] = {8, 1, 1, 8, 2, 5, 8};
        int elem = 8;
        System.out.println(findMinSwap(arr, elem));
    }

    private static int findMinSwap(int[] arr, int elem) {
//count no of elem and create a window of that size
        int elemCount = 0;
        int n = arr.length;
        int minSwaps = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (elem == arr[i]) {
                elemCount++;
            }
        }
        int start = 0;
        int end = elemCount - 1;
        int winCount = 0;
        int outSideWindowCount = 0;
        for (int i = start; i <= end; i++) {
            if (arr[i] == elem) {
                winCount++;
            }
        }
        while (start < (n - elemCount) && end < n) {
            if (start == 0 && end == elemCount - 1) {
                outSideWindowCount = elemCount - winCount;
                minSwaps = Math.min(minSwaps, outSideWindowCount);
            } else {
                if (arr[end] == elem) {
                    winCount++;
                }
                if (arr[start-1] == elem) {
                    winCount--;
                }
                outSideWindowCount = elemCount - winCount;
                minSwaps = Math.min(minSwaps, outSideWindowCount);

            }
            start++;
            end++;
        }
        return minSwaps == Integer.MAX_VALUE ? 0 : minSwaps;
    }
}