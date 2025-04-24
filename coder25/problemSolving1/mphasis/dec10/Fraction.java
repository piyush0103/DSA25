package coder25.problemSolving1.mphasis.dec10;

public class Fraction {
    public static void main(String[] args) {
        int frac1[] = {1, 3};
        int frac2[] = {3, 9};
        int frac[] = findFractionTwoNo(frac1, frac2);
    }

    private static int[] findFractionTwoNo(int[] frac1, int[] frac2) {
        int num1 = frac1[0];
        int num2 = frac2[0];
        int den1 = frac1[1];
        int den2 = frac2[1];
        int num = 0;
        int den = 0;
        if (den1 == den2) {
            num = num1 + num2;
            den = den1;
        } else {
            num = (num1 * den2) + (num2 * den1);
            den = den1 * den2;
        }
        int gcd = gcdOf(num, den);
        num = num / gcd;
        den = den / gcd;
        System.out.println(num + "    " + den);
        return new int[]{num, den};
    }

    private static int gcdOf(int num, int den) {
        if (den == 0)
            return num;
        return gcdOf(den, num % den);
    }
}
