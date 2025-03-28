package coder25.problemSolving1.bitManipulation;

public class CheckNoCanBeMadeZero {
    public static void main(String[] args) {
        int arr[] = {1, 5, 9, 7, 8};
        System.out.println(check(arr) + "   ohh");
    }

    static boolean check(int[] A) {
        // length of the array
        int n = A.length;
        // variable to store the value of XOR
        int xor = 0;
        // traversing the array
        for (int i = 0; i < n; i++) {
            xor ^= A[i];
        }
        System.out.println(xor+"  heeyyy");
        // checking if the value of XOR is even or odd
        // if even printing YES else ONO
        if (xor % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

