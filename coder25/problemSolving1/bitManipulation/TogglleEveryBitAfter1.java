package coder25.problemSolving1.bitManipulation;

public class TogglleEveryBitAfter1 {
    public static void main(String[] args) {
        int num = 10;
        ToggleEveryBit.printBit(num);
        int x = toggleBitAfter1(num);
        ToggleEveryBit.printBit(x);
        System.out.println(x);
    }

    private static int toggleBitAfter1(int num) {
        int i = 0;
        while (true) {
            if (num == 0) {
                return 0;
            }
            if ((num & 1 << i) == 0) {
                num = num ^ 1 << i;
            } else {
                num = num ^ 1 << i;
                break;
            }
            i++;
        }
        return num;
    }
}
