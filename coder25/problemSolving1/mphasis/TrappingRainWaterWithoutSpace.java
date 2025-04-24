package coder25.problemSolving1.mphasis;

public class TrappingRainWaterWithoutSpace {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(maxWaterTrapped(arr));
    }

    public static int maxWaterTrapped(int[] tower) {
        int left = 0;
        int right = tower.length - 1;
        int leftMax = tower[left];
        int rightMax = tower[right];
        int water = 0;
        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, tower[left]);
                water += leftMax - tower[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, tower[right]);
                water += rightMax - tower[right];
            }
        }
        return water;
    }
}

