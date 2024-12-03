package coder25.problemSolving1.mphasis;

public class TrappingRainWater {


    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(waterTrapped(arr));
    }

    private static int waterTrapped(int[] arr) {
        int res = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            int left = arr[i];
            for (int j = 0; j < i; j++)
                left = Math.max(left, arr[j]);
            System.out.println(left+" max");
            int right = arr[i];
            for (int j = i + 1; j < arr.length; j++)
                right = Math.max(right, arr[j]);
            System.out.println(right+" max right");
            res += Math.min(left, right) - arr[i];
        }
        return res;
    }
}
