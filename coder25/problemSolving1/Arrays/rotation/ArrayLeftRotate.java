package coder25.problemSolving1.Arrays.rotation;

public class ArrayLeftRotate {

    public static void main(String[] args) {
        int k = 3;
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        new ArrayLeftRotate().rotate(arr, k);
    }

    public void rotate(int[] nums, int k) {
        int low = 0;
        int high = nums.length - 1;
        int mid = k;
        System.out.println(" Printing before rotate");
        print1DArray(nums);
        System.out.println();
        reverse(nums, low, mid);
        reverse(nums, mid + 1, high);
        reverse(nums, low, high);
        System.out.println(" Printing after rotate");
        print1DArray(nums);
    }

    private void print1DArray(int[] nums) {
        for (int x : nums) {
            System.out.print(x + " ");
        }
    }

    private void reverse(int[] nums, int low, int mid) {
        int temp = 0;
        while (low < mid) {
            temp = nums[low];
            nums[low] = nums[mid];
            nums[mid] = temp;
            low++;
            mid--;
        }

    }
}
