package coder25.problemSolving1.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
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
        if (pos[currPos] >= 0) {
            list.add(arr[currPos]);
            pos[currPos] = -1;

        }
        if (currPos > length - 1) {
            permutaion.add(list);
            return;
        }
        permute(arr, start, length, permutaion, list, pos, currPos + 1);
        int index = start + 1;
        list = new ArrayList<>();
        list.add(arr[start]);
        currPos = start + 1;
        pos = new int[length];
        Arrays.fill(arr, 1);
        pos[index] = -1;
        pos[start] = -1;
        permute(arr, start + 1, length, permutaion, list, pos, 0);

    }
}

