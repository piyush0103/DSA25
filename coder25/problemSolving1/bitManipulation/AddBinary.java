package coder25.problemSolving1.bitManipulation;

public class AddBinary {
    public static void main(String[] args) {
        String s1 = "1";
        String s2 = "111";
        System.out.println(addBinary(s1, s2));

    }

    private static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int n1 = a.length() - 1;
        int n2 = b.length() - 1;
        while (n1 >= 0 || n1 >= 0 || carry == 1) {
            if (n1 >= 0) {
                carry += a.charAt(n1--) - '0';
            }
            if (n2 >= 0) {
                carry += b.charAt(n2--) - '0';
            }
            sb.append(carry % 2);
            carry = carry / 2;

        }
        return sb.reverse().toString();
    }
}