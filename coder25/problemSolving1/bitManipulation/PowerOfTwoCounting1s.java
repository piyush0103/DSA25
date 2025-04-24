package coder25.problemSolving1.bitManipulation;

public class PowerOfTwoCounting1s {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(num + " is power of two :: " + isPowerOfTwoleftshift(num));
    }

    public static boolean isPowerOfTwoleftshift(int n) {
        if (n == 0) {
            return false;
        }
        int x = 1;
        while (x <= n) {
        if(x==n){
            return true;
        }
            x = x << 1;
        }
        return false;
    }

}
