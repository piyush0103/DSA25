package coder25.problemSolving1.mphasis;

import java.util.Arrays;

public class RobotPath {
    public static void main(String[] args) {
        String ipnput = "DD";
        Arrays.stream(findxyCordinates(ipnput)).forEach(System.out::print);
    }

    public static int[] findxyCordinates(String input) {
        int U = 1;
        int D = -1;
        int R = 1;
        int L = -1;
        int x_cor = 0;
        int y_cor = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'U') {
                y_cor += U;
            }
            if (input.charAt(i) == 'D') {
                y_cor += D;
            }
            if (input.charAt(i) == 'R') {
                x_cor += R;
            }
            if (input.charAt(i) == 'L') {
                x_cor += L;
            }
        }
        return new int[]{x_cor, y_cor};
    }

}
