package coder25.problemSolving1.mphasis;

import java.util.Arrays;

public class LongestUniFormSubString {
    public static void main(String[] args) {
        String str = "aaabbbbccda";
        int ar[] = longestUniformSubstring(str);
        System.out.println(Arrays.toString(ar));
        System.out.println(str);
        System.out.println(str.substring(ar[0], ar[1]+1));
    }

    private static int[] longestUniformSubstring(String str) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        int arr[] = new int[2];
        int n = str.length();
        int startIndex = 0;
        int endIndex = 0;
        for (int i = 1; i < n; i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                endIndex = i - 1;
                if (count > max) {
                    max = count;
                    count=0;
                    arr[0] = startIndex;
                    arr[1] = endIndex;
                }
                startIndex = i;
            }

        }
        return arr;

    }

}
