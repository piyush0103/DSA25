package coder25.problemSolving1.bitManipulation;

public class UnsetIthBit {
    public static void main(String[] args) {
        int num=7;
        int i=3;
        int x=num&(~(1<<i));
        System.out.println(x>>i==0?"unset successful ":"failed");
    }
}
