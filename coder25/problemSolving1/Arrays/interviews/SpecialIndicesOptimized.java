package coder25.problemSolving1.Arrays.interviews;

import java.util.Arrays;

public class SpecialIndicesOptimized {
    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 7, 6, -2};
        int count = findNoSpecialIndeices(arr);
        System.out.println(count + " is this the answer");

    }

    private static int findNoSpecialIndeices(int[] arr) {
        int n = arr.length;
        int oddleft = 0;
        int evenleft = 0;
        int oddRight = 0;
        int evenRight = 0;
        int count = 0;
        int pso[] = findPSO(arr, n);
        int pse[] = findPSE(arr, n);
        System.out.println(Arrays.toString(pso));
        System.out.println(Arrays.toString(pse));
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if ((pse[n - 1] - pse[0]) == pso[n - 1]) {
                    count++;
                }
            } else {
                oddleft = pso[i - 1];
                evenleft = pse[i - 1];
                oddRight = pse[n - 1] - pse[i];
                evenRight = pso[n - 1] - pso[i];
                if ((oddleft + oddRight) == (evenRight + evenleft)) {
                    System.out.println("is it coming here ");
                    count++;
                }
            }
        }
        return count;
    }

    private static int[] findPSE(int[] arr, int n) {
        int pse[] = new int[n];
        pse[0] = arr[0];
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                pse[i] = pse[i - 1] + arr[i];
            } else {
                pse[i] = pse[i - 1];
            }
        }
        return pse;
    }

    private static int[] findPSO(int[] arr, int n) {
        int pso[] = new int[n];
        pso[0] = 0;
        pso[1] = arr[1];
        for (int i = 2; i < n; i++) {
            if (i % 2 == 0) {
                pso[i] = pso[i - 1];
            } else {
                pso[i] = pso[i - 1] + arr[i];
            }
        }
        return pso;
    }
}
