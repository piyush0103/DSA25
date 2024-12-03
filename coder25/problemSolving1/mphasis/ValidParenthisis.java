package coder25.problemSolving1.mphasis;

import java.util.Stack;

public class ValidParenthisis {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (char br : s.toCharArray()) {
            if (br == '(' || br == '[' || br == '{')
                st.push(br);
            else {
                if(st.isEmpty()) return false;
                char ch = st.pop();
                if((br == ')' && ch == '(') ||  (br == ']' && ch == '[') || (br == '}' && ch == '{')) continue;
                else return false;
            }
        }
        return st.isEmpty();
    }

    public static void main (String[] args) {

        String s="()[{}()]";
        if(isValid(s)==true)
            System.out.println("True");
        else
            System.out.println("False");
    }
}

