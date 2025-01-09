package coder25.problemSolving1.mphasis;

public class PowerOf10 {
    public static void main(String[] args) {
        int x = 10;
        int y = 1000;
        System.out.println(isPowerOf(x, y));
    }

    private static boolean isPowerOf(int x, int y) {
        if (x == 1) {
            return (y == 1);
        }
        int pow = 1;
        while (pow < y) {
            pow = pow * x;
        }
        return (pow == y);
    }

}
