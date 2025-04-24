package coder25.problemSolving1.maths;

public class LeapYear {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 1800; i++) {
            if ((i % 400 == 0) || (i % 4 == 0 && i % 100 != 0)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
