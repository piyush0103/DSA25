package coder25.problemSolving1.bitManipulation;

public class PowerOfTwo {
    public static void main(String[] args) {
        int num=16;
        System.out.println(num+" is power of two :: "+isPowerOfTwo(num));
    }

    public static boolean isPowerOfTwo(int n) {
        return  (n>0 && (n & (n-1))==0) ? true:false;
    }
}
