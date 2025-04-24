package coder25.problemSolving1.bitManipulation;

public class DivideTwoNumber {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        System.out.println(divideNumbers(dividend, divisor));
    }

    private static int divideNumbers(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == 1) return Integer.MIN_VALUE;
        boolean negative = (divisor < 0) ^ (dividend < 0);
        long absDivisor = Math.abs((long)divisor);
        long absDividend = Math.abs((long)dividend);
        int quotient = 0;
        while (absDividend >= absDivisor) {
            long tempdivisor = absDivisor, multiple = 1;
            while (absDividend >= (tempdivisor << 1)) {
                tempdivisor <<= 1;
                multiple <<= 1;
            }
            absDividend -= tempdivisor;
            quotient += multiple;
        }
        return negative ? -quotient : quotient;

    }
}