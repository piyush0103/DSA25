package coder25.problemSolving1.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationFail {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        List<List<Integer>> permutaion = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int pos[] = new int[arr.length];
        Arrays.fill(arr, 1);
        permute(arr, 0, arr.length, permutaion, list, pos, 0);
        System.out.println(permutaion + "  oh ho");
    }

    private static void permute(int[] arr, int start, int length, List<List<Integer>> permutaion, List<Integer> list, int pos[], int currPos) {
        if (start == length - 1) {
            permutaion.add(list);
//
            return;
        }
        if (arr[currPos] >= 0) {
            list.add(arr[currPos]);
            pos[currPos] = -1;
        }
        for (int i = 0; i < length; i++) {
            if (arr[i] >= 0) {
                list.add(arr[i]);
            }
        }
        permutaion.add(list);
        pos[currPos + 1] = -1;
        list = new ArrayList<>();
        list.add(arr[start]);
        permute(arr, start, length, permutaion, list, pos, currPos + 1);
        permute(arr, start + 1, length, permutaion, list, pos, start + 1);

    }
}
