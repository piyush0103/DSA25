package coder25.problemSolving1.bitManipulation;

public class AlternateBits {
    public static void main(String[] args) {
        System.out.println(isAlternateBitPresent(10) + " okay");
    }

    private static boolean isAlternateBitPresent(int n) {
        int x = n ^ (n >> 1);// XOR n with n shifted right
        return (x & (x + 1)) == 0;// Check if all bits are 1s
    }}