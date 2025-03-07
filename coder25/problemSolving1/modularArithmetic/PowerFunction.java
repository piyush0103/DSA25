package coder25.problemSolving1.modularArithmetic;

public class PowerFunction {
    public static void main(String[] args) {
        int a = 45;
        int n = 45;
        int p = 7;
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result * a;
            result = (result % p * a % p) % p;
        }
        System.out.println("ok this result " + result);
        System.out.println(" this should be good " + (Math.pow(a, n) % p));
    }
}
