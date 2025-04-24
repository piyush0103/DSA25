package coder25.problemSolving1.recursion;

public class PalindromeStr {
    public static void main(String[] args) {
        String str = "APXA";
        System.out.println(isPaLinDrome(str, 0, str.length() - 1));
    }

    private static boolean isPaLinDrome(String str, int low, int high) {
        if (low >= high) {
            return true;
        }
        if (str.charAt(low) == str.charAt(high)) {
            return isPaLinDrome(str, low + 1, high - 1);
        } else {
            return false;
        }
    }
}
