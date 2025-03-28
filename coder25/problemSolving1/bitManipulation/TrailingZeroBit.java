package coder25.problemSolving1.bitManipulation;

public class TrailingZeroBit {
    public static void main(String[] args) {
        System.out.println(findTrailingZero(12));
    }

    private static int findTrailingZero(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 0) {
                count++;
            } else {
                return count;
            }
            num >>= 1;
        }
        return count;
    }
}
