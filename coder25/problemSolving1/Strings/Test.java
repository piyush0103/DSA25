package coder25.problemSolving1.Strings;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        String str = ")()())";
        int validLen = findLongestValidParenthisisLength(str);

    }

    private static int findLongestValidParenthisisLength(String str) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        System.out.println(stack.peek()+"       here --");
        return -1;
    }

}