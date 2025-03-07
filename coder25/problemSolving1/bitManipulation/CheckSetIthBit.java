package coder25.problemSolving1.bitManipulation;

public class CheckSetIthBit {
    public static void main(String[] args) {
        int num = 15;
        int i = 3;
        System.out.println(checkSetBit(num, i));
    }

    private static boolean checkSetBit(int num, int i) {
        return (num >> i & 1) == 1;

//        return (num&1<<i)==0;
    }

}
