package coder25.problemSolving1.bitManipulation;

public class DecimalToBinaryBit {
    public static void main(String[] args) {
//        System.out.println(convertToBinaryBIt(47, 32));
        convertToBinaryBIt(47,31);
    }

    private static void convertToBinaryBIt(int num, int ar) {
        int k = 0;
        for (int i = ar; i >=0 ; i--) {
            k = num >> i;
            if ((k & 1) == 1) {
                System.out.print("1");
            } else {
                System.out.print("0");

            }
        }
    }
}
