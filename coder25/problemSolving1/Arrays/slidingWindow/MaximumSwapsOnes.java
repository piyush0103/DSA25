package coder25.problemSolving1.Arrays.slidingWindow;

public class MaximumSwapsOnes {
    public static void main(String[] args) {
        int arr[] = {1};
        int maxSwaps = findMinSwaps(arr, arr.length);
        System.out.println(maxSwaps + " jjjj");
    }

    private static int findMinSwaps(int[] arr, int length) {
        int noOFOnes = 0;
        int start = 0;
        int swaps = 0;
        int oneWindow = 0;
        int max = Integer.MAX_VALUE;
        for (int i : arr) {
            noOFOnes += i;

        }
        for (int i = 0; i < noOFOnes; i++) {
            oneWindow += arr[i];
        }
        for (int end = noOFOnes; end < length + noOFOnes; end++) {
            if (arr[end % length] == 1) {
                oneWindow++;
            }
            if (arr[start] == 1) {
                oneWindow--;
            }
            System.out.println(oneWindow + " dsd " + start + " " + noOFOnes);
            swaps = noOFOnes - oneWindow;
            max = Math.min(swaps, max);
            start++;
        }
        return max;
    }

}
