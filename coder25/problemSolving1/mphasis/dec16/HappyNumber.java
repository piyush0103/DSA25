package coder25.problemSolving1.mphasis.dec16;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        Set<Integer> visit = new HashSet<>();
        while (!visit.contains(n)) {
            visit.add(n);
            n = getNextNumber(n);
            if (n == 1) {
                return true;
            }
        }
        return false;
    }

    private static int getNextNumber(int n) {
        int output = 0;
        while (n > 0) {
            int digit = n % 10;
            output += digit * digit;
            n = n / 10;
        }
        return output;
    }
}

