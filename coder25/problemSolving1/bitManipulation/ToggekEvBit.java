package coder25.problemSolving1.bitManipulation;

public class ToggekEvBit {
    public static void main(String[] args) {
        int num = 10;
        ToggleEveryBit.printBit(num);
        int x = toggleAfterOne(num);
        ToggleEveryBit.printBit(x);
        System.out.println(x);
    }

    private static int toggleAfterOne(int num) {
        int x = num;
        int count = 0;
        while (x != 0) {
            num = num ^ 1 << count;
            count++;
            x = x >> 1;
        }
        return num;
    }
}
