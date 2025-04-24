package coder25.problemSolving1.modularArithmetic;

public class FindModulousArrayOptimized {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4};
        int count = arr.length;
        int n = count;
        int m = 3;
        int result = 0;
        int mod = (int) Math.pow(10, count - 1);
        for (int i = 0; i < count; i++) {
            result = (result % m + ((arr[i] % m) * (mod % m)) % m);
            mod = mod / 10;
        }
        System.out.println(result + " array");
    }
}


