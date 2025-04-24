package coder25.problemSolving1.Arrays.interviews;

public class MaxConsecutive1Replacing1 {
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1,1,1,1};
        int maxConsecutiveOnes = findMaxConsecutive1(arr);
        System.out.println(maxConsecutiveOnes + " oh here");
    }

    private static int findMaxConsecutive1(int[] arr) {
        if (arr == null) {
            return -1;
        }
        if (arr.length == 1) {
            return arr.length;
        }
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int leftOnes = 0;
        int rightOnes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int k = i + 1;
                while (k < arr.length && arr[k] != 0) {
                    rightOnes++;
                    k++;
                }
                sum = leftOnes + rightOnes + 1;
                max = Math.max(sum, max);
                leftOnes = 0;
                rightOnes = 0;
            } else {
                leftOnes++;
            }

        }
        if(leftOnes>0){
            max=Math.max(max,leftOnes);
        }
        return max;
    }
}
