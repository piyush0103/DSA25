package coder25.problemSolving1.bitManipulation;

public class ReverseBit {
    public static void main(String[] args) {
        String bits = "00000010100101000001111010011100";
        int num = findReverseBit(bits);
        int num2=reverseBits(151);
        System.out.println("reverseBIT  " + num);
        System.out.println("reverseBIT2  " + num2);
    }

    private static int findReverseBit(String bits) {
        int res = 0;
        for (int i = 31; i >= 0; i--) {
            res <<= 1;
            res = res + ((bits.charAt(i) - '0') % 2);
        }
        return res;
    }

    public static int reverseBits(int n) {
        int res=0;
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int bit = n & 1;
            result = (result << 1) + bit;
            n = n >>> 1;
        }
        return result;
    }
}
