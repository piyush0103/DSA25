package coder25.problemSolving1.modularArithmetic;

public class ExcelSheetName {
    public static void main(String[] args) {
        String str = "ZA";
        int val = findExcelVal(str);
        System.out.println(" Excel value for " + str + "   is  " + val);
    }

    private static int findExcelVal(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result *= 26;
            result += s.charAt(i) - 'A' + 1;
        }
        return result;

    }
}
