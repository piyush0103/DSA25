package coder25.problemSolving1.Arrays.hashing;

import java.util.HashSet;

public class SubArraySumequals {
    public static void main(String[] args) {
        int arr[] = {1, 4, -2, -2, 5, -4, 3};
        int sum = 0;
        System.out.println(subArraysExist(arr, sum));
    }

    private static boolean subArraysExist(int[] arr, int sum) {
        HashSet<Integer> hash = new HashSet<>();
        int add = 0;
        for (int i = 0; i < arr.length; i++) {
            add += arr[i];
            if (arr[i] == sum || add == sum || hash.contains(add)) {
                return true;
            }
            hash.add(add);
            System.out.println(hash);
        }
        return false;
    }

}
