package coder25.problemSolving1.Arrays.prefix;

import coder25.problemSolving1.Arrays.slidingWindow.PivotIndex;

public class EquillibriumIndex {
    public static void main(String[] args) {
        int input[] = {1, 7, 3, 6, 5, 6};
//        brute force approach
//        int index = new PivotIndex().pivotIndex(input);
//        System.out.println("pivot index " + index);
//    optimal approach
        int index2 = new EquillibriumIndex().getItByPrefix(input);
        System.out.println("pivot index " + index2);
    }

    private int getItByPrefix(int arr[]) {
        int equi = -1;
        int prefix[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                prefix[i] = arr[i];
            } else {
                prefix[i] = prefix[i - 1] + arr[i];
            }
        }
        printElement(prefix);
        for (int i = 1; i < prefix.length; i++) {
            if (prefix[i-1] == prefix[prefix.length - 1] - prefix[i]) {
                equi = i;
                break;
            }
        }
        return equi;
    }

    private void printElement(int[] prefix) {
        for (int x : prefix) {
            System.out.print(x + " || ");
        }
        System.out.println();
    }
}
