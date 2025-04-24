package coder25.problemSolving1.Arrays.carryForward;

public class MaxConsecutiveonewith1Swap1ZeroCarryForward {
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0};
        int maxConsecutiveZero = findMaxConsecutiveZero(arr, arr.length);
        System.out.println(maxConsecutiveZero + "  sol");
    }

    private static int findMaxConsecutiveZero(int[] arr, int length) {
        int left = 0;
        int right = 0;
        int maxones = Integer.MIN_VALUE;
        int countOnes = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] == 1) {
                countOnes++;
            }
        }
        int sum = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] == 1) {
                left++;
            } else {
                for (int j = i + 1; j < length; j++) {
                    if (arr[j] == 1) {
                        right++;
                    } else {
                        break;
                    }
                }
                if (left + right == countOnes) {
                    sum = left + right;
                } else {
                    sum = left + right + 1;
                }
                maxones = Math.max(maxones, sum);
                left = 0;

            }
            right = 0;

        }
        return maxones;
    }
}


