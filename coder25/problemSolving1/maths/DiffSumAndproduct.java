package coder25.problemSolving1.maths;

public class DiffSumAndproduct {
    public static void main(String[] args) {
        int num = 453;
        System.out.println("diff sum and product " + findDiff(num));
    }

    private static int findDiff(int num) {
        int res = num;
        int product = 1;
        int sum = 0;
        int rem = 0;
        while (res > 0) {
            rem = res % 10;
            sum += rem;
            product *= rem;
            res = res / 10;
        }
        return Math.abs(product - sum);
    }
}
