package coder25.problemSolving1.bitManipulation;

public class SingleNo2Optimized {
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,1,2,3};
        int singleNo = findSingleNo(arr);
        System.out.println("single no is " + singleNo);
    }
public static int findSingleNo(int []nums){
    int ones = 0;
    int twos = 0;

    for (final int num : nums) {
        ones ^= (num & ~twos);
        twos ^= (num & ~ones);
    }

    return ones;
}
}

