package coder25.problemSolving1.mphasis.dec15;

public class IntegerFromString {
    public static void main(String[] args) {
        String input = "34b";
        System.out.println(findInteger(input));
    }

    private static int findInteger(String input) {
        int start = -1;
        if (input == null) {
            return 0;
        }
        StringBuilder str = new StringBuilder("0");
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) - '0' <= 9) {
                str.append(input.charAt(i));
                start = i;
            } else {
                if (start > -1) {
                    break;
                }

            }
        }
        return str.length() > 0 ? Integer.parseInt(new String(str)) : 0;
    }
}
