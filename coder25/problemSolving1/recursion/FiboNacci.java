package coder25.problemSolving1.recursion;

public class FiboNacci {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        while (n1 < 10) {
            System.out.print(n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

        }
    }
}
