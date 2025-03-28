package coder25.problemSolving1.recursion;

import java.util.ArrayList;
import java.util.List;

public class TryStringBuilder {
    public static void main(String[] args) {
        List<StringBuilder> str = new ArrayList<>();
        StringBuilder sr = new StringBuilder("");
        for (int i = 0; i < 4; i++) {
            sr.append('0' - i);
        }
        str.add(sr);
        System.out.println(str);
        sr.deleteCharAt(sr.length() - 1);
        System.out.println(str);
    }
}
