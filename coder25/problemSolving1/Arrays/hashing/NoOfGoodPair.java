package coder25.problemSolving1.Arrays.hashing;

import java.util.Arrays;

public class NoOfGoodPair {
    public static void main(String[] args) {
        int arr[] = {1,1,1};
        System.out.println(findNoOfGoodPair(arr) + "      ...okay");
    }

    private static int findNoOfGoodPair(int[] arr) {
        int hash[] = new int[1000];
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += hash[arr[i]]++;
            System.out.println(res + " xx  " + arr[i]);
        }
        return res;
    }
}
