package coder25.problemSolving1.Arrays.carryForward;

public class MaxConsecutiveonewith1swapCarryForward {
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0};
        int maxConsecutiveZero = findMaxConsecutiveZero(arr, arr.length);
        System.out.println(maxConsecutiveZero + "  sol");
    }

    private static int findMaxConsecutiveZero(int[] arr, int length) {
        int left = 0;
        int right = 0;
        int maxones = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] == 1) {
                sum++;
            } else {
                for (right = i + 1; right < length; right++) {
                    if (arr[right] == 1) {
                        sum++;
                    } else {
                        break;
                    }
                }
                maxones = Math.max(maxones, (sum + 1));
                sum = 0;

            }

        }
        return maxones;
    }
}


