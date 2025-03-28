package coder25.problemSolving1.recursion;

public class PowerOfRec {
    public static void main(String[] args) {
        System.out.println(findPowerRecNor(2, 3));
        System.out.println(findPowerRecOpt(2, 111));
    }

    private static int findPowerRecNor(int num, int pow) {
        if (pow == 0) {
            return 1;
        }
        return num * findPowerRecNor(num, pow - 1);
    }

    private static double findPowerRecOpt(int num, int pow) {
        if (pow == 0) {
            return 1;
        }
        double p = (findPowerRecOpt(num, pow / 2))%Math.pow(10,9);
        if (pow % 2 == 0) {
            return ((p % Math.pow(10, 9)) * (p % Math.pow(10, 9)) % Math.pow(10, 9));
        } else {
            return ((p % Math.pow(10, 9)) * (p % Math.pow(10, 9)) % Math.pow(10, 9) * num%Math.pow(10,9))%Math.pow(10,9);
        }
    }
}
