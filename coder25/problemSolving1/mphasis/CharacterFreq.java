package coder25.problemSolving1.mphasis;

public class CharacterFreq {
    public static void main(String[] args) {
        String str = "aabbccc";
        System.out.println(printCharacterFreq(str));
        System.out.println(printCharacterFreq(str).length());

    }

    private static String printCharacterFreq(String str) {
        int freq[] = new int['z' - 'A' + 2];
        char[] arr = str.toCharArray();
        for (char x : arr) {
            freq[x - 'A']++;
        }
        String returnStr = "";
        int count = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                returnStr += (char) (i + 'A');
                count = freq[i];
                returnStr += count;
            }

        }
        return returnStr;
    }
}
