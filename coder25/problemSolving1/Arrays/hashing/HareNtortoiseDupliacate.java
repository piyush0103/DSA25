package coder25.problemSolving1.Arrays.hashing;

public class HareNtortoiseDupliacate {
    public static void main(String[] args) {
        int arr[]={1,3,4,2,2};
        System.out.println(findDuplicate(arr));

    }
    public static  int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do { // we are sure that at least one duplicate is there
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);
        // find the head of loop
        fast = nums[0];
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }
}

