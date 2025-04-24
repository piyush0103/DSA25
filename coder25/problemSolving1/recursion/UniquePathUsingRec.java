package coder25.problemSolving1.recursion;

public class UniquePathUsingRec {
    public static void main(String[] args) {
        int m = 3, n = 3;
        System.out.println(UniquePathMatrixRec(m-1, n-1));
    }

    private static int UniquePathMatrixRec(int m, int n) {
        if (m == 0 || n == 0) {
            return 1;
        }
        return UniquePathMatrixRec(m - 1, n) + UniquePathMatrixRec(m, n - 1);
    }
}
