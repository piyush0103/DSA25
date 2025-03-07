package coder25.problemSolving1.Strings;

public class ToggleEveryCharacterOptimized {
    public static void main(String[] args) {
        String str = "HeyEveryTh";
        System.out.println(printToggled(str));
    }

    private static String printToggled(String str) {
        char[] arr = null;
        if (str != null) {
            arr = str.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (char) (arr[i] ^ (1 << 5));
            }
        }
        return new String(arr);
    }
}
