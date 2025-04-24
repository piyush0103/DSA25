package coder25.problemSolving1.Arrays.interviews;

public class MaxConsecutiveByFlippingKzero {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1};
        int k = 2;
        int maxConsecutiveOnes = findConsecutiveByFlippingKzero(arr, k);
        System.out.println(maxConsecutiveOnes + " oh here");
    }

    private static int findConsecutiveByFlippingKzero(int[] arr, int k) {
        if (arr == null) {
            return -1;
        }
        int start = 0;
        int end = 0;
        int zeroes = 0;
        while (end < arr.length) {
            if (arr[end] == 0) {
                zeroes++;

            }
            end++;
            if (zeroes > k) {
                if (arr[start] == 0) {
                    zeroes--;
                }
                start++;
            }
        }
        return end - start;
    }

}