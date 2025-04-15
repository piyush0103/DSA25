package coder25.problemSolving1.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetRecursion {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3,};
        List<List<Integer>> subsetList = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(arr);
        findAllSubSetRec(arr, subsetList, temp, 0);
        System.out.println(subsetList + " oh ok");

    }

    private static void findAllSubSetRec(int[] arr, List<List<Integer>> subsetList, List<Integer> temp, int start) {
        subsetList.add(new ArrayList<>(temp));
        for (int i = start; i < arr.length; i++) {
            temp.add(arr[i]);
            findAllSubSetRec(arr, subsetList, temp, i + 1);
            temp.remove(temp.size() - 1);
        }

    }
}
