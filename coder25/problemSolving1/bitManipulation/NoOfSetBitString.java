package coder25.problemSolving1.bitManipulation;

public class NoOfSetBitString {
    public static void main(String[] args) {
        String str = " 00000000000000000000000000001011";
        System.out.println(countNoOfSetBit(str) + "   okay");
    }

    private static int countNoOfSetBit(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) - '0' > 0) {
                count++;
            }
        }
        return count;
    }
}
