package coder25.problemSolving1.mphasis;

public class TrappingRainWaterPrefix {
    static int maxWaterTrapped(int[] arr) {
        int n = arr.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int res = 0;
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }
        printArray(leftMax);
        printArray(rightMax);

        for (int i = 1; i < n - 1; i++) {
            int minOf2 = Math.min(rightMax[i - 1], rightMax[i + 1]);
            if (minOf2 > arr[i]) {
                res += minOf2 - arr[i];
            }
        }
        return res;
    }

    private static void printArray(int[] leftMax) {
        System.out.println("printing prefix");
        for(int x:leftMax){
            System.out.print(x+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(maxWaterTrapped(arr));
    }
}

