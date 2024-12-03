package coder25.problemSolving1.Arrays.slidingWindow;

public class MinimumSwapInCircularArray {
    public static void main(String[] args) {
        int arr[] = {1,1,1,0,0,1,0,1,1,0};
        System.out.println(findMinSwaps(arr));
    }

    private static int findMinSwaps(int[] arr) {
        int oneCount = 0;
        int n = arr.length;
        int minSwaps = Integer.MAX_VALUE;
        if (n <= 1) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if (1 == arr[i]) {
                oneCount++;
            }
        }
        int start = 0;
        int end = oneCount - 1;
        int winCount = 0;
        int outSideWindowCount = 0;
        for (int i = start; i <= end; i++) {
            if (arr[i] == 1) {
                winCount++;
            }   
        }
        if (arr[n - 1] == 1) {
            winCount++;
            start = -1;
        }
        while ((start <= n - oneCount) && (end <= n)) {
            System.out.println(end+"  "+n+" "+start+" dsd "+oneCount);
            if (end == n) {
                end = 0;
                System.out.println("came here");
            }
            if (start <= 0) {
                outSideWindowCount = oneCount - winCount;
                minSwaps = Math.min(minSwaps, outSideWindowCount);
            } else {
                if (arr[end] == 1) {
                    winCount++;
                }
                if (arr[start - 1] == 1) {
                    winCount--;
                }

            }
            outSideWindowCount = oneCount - winCount;
            minSwaps = Math.min(minSwaps, outSideWindowCount);
            start++;
            end++;
        }
        return minSwaps == Integer.MAX_VALUE ? 0 : minSwaps;
    }
}
