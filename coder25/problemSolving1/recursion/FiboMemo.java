package coder25.problemSolving1.recursion;

public class FiboMemo {
    public static void main(String[] args) {
        int n=20;
        int memo[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            System.out.print(fiboRecMem(i, memo)+"  ");
        }
    }

    private static int fiboRecMem(int num, int memo[]) {
        if (memo[num] != 0) {
            return memo[num];
        }
        if (num <= 1) {
            memo[num]=num;
            return num;

        } else {
            memo[num] = fiboRecMem(num - 1, memo) + fiboRecMem(num - 2, memo);
            return memo[num];
        }
    }
}
