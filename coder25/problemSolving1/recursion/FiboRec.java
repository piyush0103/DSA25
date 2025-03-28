package coder25.problemSolving1.recursion;

public class FiboRec {
    public static void main(String[] args) {
        System.out.println(fiboRec(10));
    }

    private static int fiboRec(int num) {
        if (num <= 1) {
            return num;
        }
      return fiboRec(num-1)+fiboRec(num-2);
    }
}
