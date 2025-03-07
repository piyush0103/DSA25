package coder25.problemSolving1.Strings;

public class ToggleEveryCharacter {
    public static void main(String[] args) {
        String str = "HeyEveryTh";
        System.out.println(printToggled(str));
    }

    private static String printToggled(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 'a' - 'A');
            } else if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch + 'A' - 'a');

            }
            result += ch;
        }
        return result;
    }
}
