package coder25.problemSolving1.mphasis.dec15;

public class WinnerOfCircleRecursive {
    public static void main(String[] args) {
        System.out.println(new WinnerOfCircleRecursive().findTheWinner(3, 2));

    }

    public int findTheWinner(int n, int k) {
        return circularRecursion(n, k) + 1;
    }

    private int circularRecursion(int n, int k) {
        if (n == 1) {
            return 0;
        }
        System.out.println(n + " ======   " + (n + k) % n);
        return (circularRecursion(n - 1, k) + k) % n;
    }
}


