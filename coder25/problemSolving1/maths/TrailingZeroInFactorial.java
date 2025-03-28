package coder25.problemSolving1.maths;

public class TrailingZeroInFactorial {
    public static void main(String[] args) {
        int countZero = findTrailingZero(15);
        System.out.println(findFactoroial2(15) + " heyyy");
        System.out.println(countZero + " trailing zero");
    }

    private static int findFactoroial2(int n) {
        return (n == 1 || n == 0) ? 1
                : n * findFactoroial2(n - 1);
    }

    private static int findFactoroial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * findFactoroial(n - 1);
    }

    private static int findTrailingZero(int n) {
        int res = 0;
        while (n > 0) {
            n /= 5;
            res += n;
        }
        return res;
    }}
