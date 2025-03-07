package coder25.problemSolving1.Arrays.sorting;

import java.util.Arrays;

public class MissingPositiveNo {
    public static void main(String[] args) {
        int arr[] = {3, 4, -1, 1};
        int x = findFirstMissingNo(arr);
        System.out.println("missing no " + x);
    }

    private static int findFirstMissingNo(int[] arr) {
        Arrays.sort(arr);
        int elem = 1;
        for (int x : arr) {
            if (elem == x) {
                elem++;
            } else if (x > elem) {
                return elem;

            }
        }
        return elem;
    }
}
