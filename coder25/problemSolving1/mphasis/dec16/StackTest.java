package coder25.problemSolving1.mphasis.dec16;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(45);
        stack.push(451);
        stack.push(415);
        stack.push(4115);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
