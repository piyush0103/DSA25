package coder25.problemSolving1.Strings;

import java.util.Stack;

public class LongestValidParenthesis {
    public static void main(String[] args) {
        String str = "(()())";
        int validLen = findLongestValidParenthisisLength(str);
        System.out.println(validLen + "here is the answer");

    }

    private static int findLongestValidParenthisisLength(String str) {
        Stack<Integer> stack = new Stack<>();
        int maxValidPair = 0;
        stack.push(-1);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxValidPair = Math.max(maxValidPair, i - stack.peek());
                }
                System.out.println(i + "  max:  " + maxValidPair + "   peekl ::  " + stack.peek());
            }
        }
        return maxValidPair;
    }
}
