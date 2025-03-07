package coder25.problemSolving1.Arrays.interviews;

public class MaxNoOfConsecutiveBySwapping {
    public static void main(String[] args) {
        String str = "11010110000000000";
        int maxConsecutiveOnes = findMaxConsecutiveSwap(str);
        System.out.println(maxConsecutiveOnes + " oh here");
    }

    private static int findMaxConsecutiveSwap(String arr) {
        if (arr == null) {
            return -1;
        }
        if (arr.length() == 1) {
            return arr.length();
        }
        int noOfOnes = 0;
        for (int i = 0; i < arr.length(); i++) {
            if (arr.charAt(i) == '1') {
                noOfOnes++;
            }
        }
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int leftOnes = 0;
        int rightOnes = 0;
        for (int i = 0; i < arr.length(); i++) {
            if (arr.charAt(i) == '0') {
                int k = i + 1;
                while (k < arr.length() && arr.charAt(k) != '0') {
                    rightOnes++;
                    k++;
                }
                sum = leftOnes + rightOnes;
                if (noOfOnes > sum) {
                    sum += 1;
                }
                max = Math.max(sum, max);
                leftOnes = 0;
                rightOnes = 0;
            } else {
                leftOnes++;
            }

        }
        if (leftOnes > max) {
            return leftOnes;
        }
        return max;
    }
}
