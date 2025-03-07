package coder25.problemSolving1.Arrays.interviews;

import java.util.Arrays;

public class QueryEvenOdd {
    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 7, 6, -2, -3, 4, 2, 7};
        int result = queryMaster(arr, 0, 8, "E");
        System.out.println("printing result " + result);

    }

    private static int queryMaster(int[] arr, int start, int end, String e) {
        int prefixEven[] = new int[arr.length];
        int prefixOdd[] = new int[arr.length];
        prefixEven[0] = arr[0];
        prefixOdd[0] = 0;
        prefixOdd[1] = arr[1];
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0) {
                prefixEven[i] = arr[i] + prefixEven[i - 1];
            } else {
                prefixEven[i] = prefixEven[i - 1];
            }
        }
        for (int i = 2; i < arr.length; i++) {
            if (i % 2 != 0) {
                prefixOdd[i] = arr[i] + prefixOdd[i - 1];
            } else {
                prefixOdd[i] = prefixOdd[i - 1];
            }
        }
        System.out.println(" prefix even " + Arrays.toString(prefixEven));
        System.out.println(" prefix odd " + Arrays.toString(prefixOdd));
        if (e == "E") {
            return prefixEven[end] - prefixEven[start];
        } else {
            return prefixOdd[end] - prefixOdd[start];
        }
    }
}