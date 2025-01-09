package coder25.problemSolving1.mphasis.dec10;

public class LongestSubstringPalindrome {
    public static void main(String[] args) {
        String str = "AEDBBBD";
        String longestPalinDrome = findLongestPalinDrome(str);
        System.out.println(longestPalinDrome + "   ");
    }

    private static String findLongestPalinDrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int odd = chckPalinDrome(s, i, i);
            int even = chckPalinDrome(s, i, i + 1);
            int max_len = Math.max(odd, even);
            if (max_len > end - start) {
                start = i - (max_len - 1) / 2;
                System.out.println(start+"s   s");
                end = i + max_len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int chckPalinDrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}