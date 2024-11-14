package coder25.problemSolving1.Arrays.rotation;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int nums[] = {5, 0, 1, 0, 3, 12};
        new MoveZeroesToEnd().moveZeroes(nums);
        print1dArray(nums);
    }

    private static void print1dArray(int[] nums) {
        for (int x : nums) {
            System.out.print(x + " ");
        }
    }

    public void moveZeroes(int[] nums) {
        int zeroStart = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (zeroStart == -1) {
                    zeroStart = i;
                }

            } else {
                if (zeroStart >= 0) {
                    nums[zeroStart] = nums[i];
                    nums[i] = 0;
                    zeroStart++;

                }
            }

        }
    }
}

