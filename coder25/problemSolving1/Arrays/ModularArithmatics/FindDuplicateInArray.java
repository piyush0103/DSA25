package coder25.problemSolving1.Arrays.ModularArithmatics;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        int num[] = {3,3,3,3,3,4,4};
        int dupM = findDupMissing(num);
        System.out.println(dupM);
    }

    private static int findDupMissing(int[] nums) {
        int mod = (int)1e5 + 1;
        for(int i=0;i<nums.length;i++) {
            int ind = Math.abs(nums[i])%mod;
            if(nums[ind]/mod > 0) {
                return ind;
            }
            nums[ind] += mod;
        }
        return -1;
    }
}