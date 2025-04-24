package coder25.problemSolving1.recursion.retry;

import java.util.ArrayList;
import java.util.List;

public class SubsetBacktrackingWithDuplicate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3,};
        List<List<Integer>> subsetList = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        subsetsBackTrackingDup(arr, subsetList, temp, 0);
        System.out.println(subsetList + " oh ok");
//        return subsetList;
    }

    private static void subsetsBackTrackingDup(int[] arr, List<List<Integer>> subsetList, List<Integer> temp, int start) {
        subsetList.add(new ArrayList<>(temp));
        for (int i = start; i < arr.length; i++) {
            if (i > start && arr[i] == arr[i - 1]) {
                continue;
            }
            temp.add(arr[i]);
            subsetsBackTrackingDup(arr, subsetList, temp, i + 1);
            temp.remove(temp.size() - 1);

        }
    }
}
