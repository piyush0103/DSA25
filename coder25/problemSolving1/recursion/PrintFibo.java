package coder25.problemSolving1.recursion;

public class PrintFibo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(fiboRecprint(i) + " ** ");
        }
    }

    private static int fiboRecprint(int num) {
        if (num <= 1) {
            return num;
        }
        return fiboRecprint(num - 1) + fiboRecprint(num - 2);
    }
}
