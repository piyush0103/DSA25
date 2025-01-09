package coder25.problemSolving1.mphasis.dec10;

import java.util.HashMap;

public class Fraction2Decimal {
    public static void main(String[] args) {
        String result = new Fraction2Decimal().fractionToDecimal(10, 3);
        System.out.println(result);
    }

    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";
        StringBuilder result = new StringBuilder();
        if (numerator < 0 ^ denominator < 0) {
            result.append("-");
        }
        long num = Math.abs((long) numerator);
        long denom = Math.abs((long) denominator);
        long remainder = num % denom;
        result.append(num / denom);
        if (remainder == 0) {
            return result.toString();
        }
        result.append(".");
        HashMap<Long, Integer> map = new HashMap<>();
        while (remainder != 0) {
            if (map.containsKey(remainder)) {
                result.insert(map.get(remainder), "(");
                result.append(")");
                break;
            }
            map.put(remainder, result.length());
            remainder *= 10;
            result.append(remainder / denom);
            remainder %= denom;
        }
        return result.toString();
    }
}

