package coder25.problemSolving1.mphasis.dec10;

public class GCDofTwoNoOptimized {
    public static void main(String[] args) {
        int nums[] = {2, 5, 6, 9, 10};
        int minEle = Integer.MAX_VALUE;
        int maxEle = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (minEle > nums[i]) {
                minEle = nums[i];
            }
            if (maxEle < nums[i]) {
                maxEle = nums[i];
            }
        }
        int res = findMinMaxGCD(10, 0);
        System.out.println(res + "min " + minEle + " max:   " + maxEle);
    }

    private static int findMinMaxGCD(int a, int b) {
        if (b == 0)
            return a;
        return findMinMaxGCD(b, a % b);
    }
}



