package coder25.problemSolving1.searching;

public class SquareRootX {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(findSquareRootUsingBinary2(x));
    }

    private static int findSquareRootUsingBinary2(int x) {
        if (x == 0) {
            return 0;
        }
        int low = 1;
        int high = x;
        int result = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid <= x / mid) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }


    private static double findSquareRootUsingBinary(int x) {
        double result = 0;
        if (x == 0 || x == 1) {
            return (double) x;
        }
        int low = 1;
        int high = x;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (((double) mid * mid) == x) {
                return mid;
            }
            if (((double) mid * mid) > x) {
                high = mid - 1;

            }
            if (((double) mid * mid) < x) {
                low = mid + 1;
            }
        }
        return Math.round(high);
    }
}