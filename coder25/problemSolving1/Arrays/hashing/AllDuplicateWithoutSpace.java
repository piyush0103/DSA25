package coder25.problemSolving1.Arrays.hashing;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicateWithoutSpace {
    public static void main(String[] args) {
        int arr[] = {10,2,5,10,9,1,1,4,3,7};
        List<Integer> dup = findAllDuplicate(arr);
        System.out.println(dup);
    }

    private static List<Integer> findAllDuplicate(int[] arr) {
        List<Integer> dup = new ArrayList<>();
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            idx = arr[i];
            if (idx < 0) {
                idx = (idx * -1) - 1;
            } else if (idx > 0) {
                idx = idx - 1;
            }
            if (arr[idx] > 0) {
                arr[idx] = -arr[idx];
            } else {
                dup.add(Math.abs(arr[idx]));
            }
        }
        return dup;
    }
}
