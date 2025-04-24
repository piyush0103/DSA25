package coder25.problemSolving1.mphasis.dec15;

public class PascalTriangle {
    public int factors(int i) {
        if (i == 0)
            return 1;
        return i * factors(i - 1);
    }

    public static void main(String[] args) {
        int n = 4, i, j;
        PascalTriangle pascal = new PascalTriangle();
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(
                        " "
                                + pascal.factors(i)
                                / (pascal.factors(i - j)
                                * pascal.factors(j)));
            }
            System.out.println();
        }
    }
}

