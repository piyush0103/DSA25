package coder25.problemSolving1.bitManipulation;

public class TotalHammingDistance {
    public static void main(String[] args) {
        int arr[]={10,9};
        System.out.println(findTotalHammingDistance(arr));
    }

    private static int findTotalHammingDistance(int[] nums) {
        int hammingD = 0;
        for( int i = 0 ; i < 32 ; i++)
        {
            int count1s = 0;
            for( int j = 0; j < nums.length; j++)
            {
                count1s += (nums[j] >>> i)&1 ;
            }
            hammingD += (count1s)*(nums.length - count1s);
        }
        return hammingD;
    }
}
