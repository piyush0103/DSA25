package coder25.problemSolving1.mphasis;

public class FirstNonRepeatCharacter {
    public static void main(String[] args) {
        String str = "leetcode".toLowerCase();
      char s=  find(str);
        System.out.println(s+" sdmnjfnbjs");
    }

    public static char find(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }
        return '0';
    }
}
