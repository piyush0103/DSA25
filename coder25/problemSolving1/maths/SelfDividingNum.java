package coder25.problemSolving1.maths;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNum {
    public static void main(String[] args) {
        System.out.println(findSelfDividingNo(111, 999));
    }

    private static List<Integer> findSelfDividingNo(int start, int end) {
        List<Integer> selfD = new ArrayList<Integer>();
        for (int i = start; i <= end; i++) {
            if (checkSelfDivide(i)) {
                selfD.add(i);
            }
        }
        return selfD;
    }

    private static boolean checkSelfDivide(int num) {
        int div = 0;
        int n = num;
        while (num > 0) {
            div = num % 10;
            if (div == 0 || n % div != 0) {
                return false;
            }
            num = num / 10;
        }
        return true;
    }
}
