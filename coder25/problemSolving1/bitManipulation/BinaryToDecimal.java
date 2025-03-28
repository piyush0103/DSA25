package coder25.problemSolving1.bitManipulation;

public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println(binatyToDecimal(1111));
        System.out.println(binatyToDecimalStr("11110") + " hey we really got it");
    }

    private static int binatyToDecimalStr(String str) {
        int ans = 0;
        int p = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            int x = str.charAt(i) - '0';
            System.out.println(x + " hmm");
            ans += x * (1 << p);
            p++;
        }
        return ans;
    }

    private static int binatyToDecimal(int num) {
        int r = 0;
        int p = 0;
        int ans = 0;
        while (num > 0) {
            r = num % 10;
            ans += r * (1 << p);
            p++;
            num /= 10;
        }
        return ans;

    }
}
