package coder25.problemSolving1.mphasis;

public class LongestSubstringPalindrome {
    public static void main(String[] args) {
        String str = "cbbd";
        String longestPalinDrome = findLongestPalinDrome(str);
        System.out.println(longestPalinDrome+" jjjjj");
    }

    private static String findLongestPalinDrome(String str) {
        String leftStr = null;
        String rightStr = null;
        String maxStr = str.substring(0, 1);
        for (int i = 0; i < str.length(); i++) {
            leftStr = checkPalindrome(str, i, i);
            rightStr = checkPalindrome(str, i, i+1);
            if (leftStr.length() > maxStr.length()) {
                maxStr = leftStr;
            }
            if (rightStr.length() > maxStr.length()) {
                maxStr = rightStr;
            }
        }
        return maxStr;

    }

    private static String checkPalindrome(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return str.substring(left + 1, right);
    }
}
