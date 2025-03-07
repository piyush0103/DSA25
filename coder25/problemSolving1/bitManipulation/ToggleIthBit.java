package coder25.problemSolving1.bitManipulation;

public class ToggleIthBit {
    public static void main(String[] args) {
        int num=10;
        int i=3;
        int x=num^(1<<i);
        System.out.println(x);
    }
}
