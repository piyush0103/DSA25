package coder25.problemSolving1.bitManipulation;

public class NoOfSetBit {
    public static void main(String[] args) {
        int n = 2147483645;
        System.out.println("No of Set bit " + findNoOfSetBit(n));
    }

    private static int findNoOfSetBit(int n) {
        int res = 0;
        for (int i = 0; i < 31; i++) {
            if ((n >> i & 1) == 1) {
                res += 1;
            }

        }
        return res;
    }
}
