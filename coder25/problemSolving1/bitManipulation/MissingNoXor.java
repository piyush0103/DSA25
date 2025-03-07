package coder25.problemSolving1.bitManipulation;

public class MissingNoXor {
    public static void main(String[] args) {
        int num[] = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int n = num.length;
        int miss = findMissinNo(num);
        System.out.println(miss + "this is the missing no");
    }

    private static int findMissinNo(int[] num) {
        int n = num.length;
        int ans = 0;
        for (int x : num) {
            ans = ans ^ x;
        }
        for (int i = 0; i <= n; i++) {
            ans = ans ^ i;
        }
        return ans;

    }
}
