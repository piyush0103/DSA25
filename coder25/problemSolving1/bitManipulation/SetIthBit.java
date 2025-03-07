package coder25.problemSolving1.bitManipulation;

public class SetIthBit {
    public static void main(String[] args) {
        int num = 5;
        int i = 3;
        int x = num | 1 << i;
        System.out.println((x >> i & 1) == 0 ? "unset " : "set");

    }
}
