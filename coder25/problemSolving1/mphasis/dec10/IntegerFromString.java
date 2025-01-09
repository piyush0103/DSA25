package coder25.problemSolving1.mphasis.dec10;

public class IntegerFromString {
    public static void main(String[] args) {
        String s = "345a";
        StringBuilder r = new StringBuilder();
        boolean wasDigit = false;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                r.append(c);
                wasDigit = true;
            } else if (wasDigit) {
                r.append(" ");
                wasDigit = false;
            }
        }
        String a = r.toString().trim();
        System.out.println(a.isEmpty() ? "-1" : a);
    }
}
