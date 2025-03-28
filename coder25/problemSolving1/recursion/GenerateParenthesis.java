package coder25.problemSolving1.recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {
        ArrayList<String> res = new ArrayList<>();
        int n = 3;
        generateValidparenthesis(0, 0, n, new StringBuilder(), res);
//        System.out.println(res);
//        return res;
    }

    public static void generateValidparenthesis(int start, int close, int n, StringBuilder asf, ArrayList<String> res) {
        if (start == close && start + close == n * 2) {
            res.add(asf.toString());
            return;
        }
        if (start < n) {
            asf.append("(");
            generateValidparenthesis(start + 1, close, n, asf, res);
            asf.deleteCharAt(asf.length() - 1);
            System.out.println(asf + "================    start "+start);
            System.out.println();

        }
        if (close < start) {
            asf.append(")");
            generateValidparenthesis(start, close + 1, n, asf, res);
            asf.deleteCharAt(asf.length() - 1);
            System.out.println(asf + "===============    close "+close);
            System.out.println();
        }
    }
}