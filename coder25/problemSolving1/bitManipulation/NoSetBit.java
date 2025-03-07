package coder25.problemSolving1.bitManipulation;

public class NoSetBit {
    public static void main(String[] args) {
        int num=45455;
        System.out.println(findNoOFSetBit(num));
    }

    private static int findNoOFSetBit(int n) {
        int count = 0;

        while(n != 0){
            n = n & (n - 1);
            count++;
        }

        return count;
    }
}