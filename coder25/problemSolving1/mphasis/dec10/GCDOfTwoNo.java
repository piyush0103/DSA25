package coder25.problemSolving1.mphasis.dec10;

public class GCDOfTwoNo {
    public static void main(String[] args) {
        int arr[]={2,5,6,9,10};
        int GCD=findGCD(arr);
        System.out.println(GCD);
    }
    public static  int findGCD(int[] nums) {
        int minEle=Integer.MAX_VALUE;
        int maxEle=Integer.MIN_VALUE;
        for( int i=0; i<nums.length; i++)
        {
            if(minEle>nums[i])
            {
                minEle=nums[i];
            }
            if(maxEle<nums[i])
            {
                maxEle=nums[i];
            }
        }
        int i=1;
        int gcd=1;
        while(i<=minEle)
        {
            if(minEle%i==0 && maxEle%i==0)
            {
                gcd=i;
            }
            i++;
        }
        return gcd;
    }
}

