package coder25.problemSolving1.recursion;

import java.util.ArrayList;
import java.util.List;

public class SumOfAllSubSetBitMa {
    public static void main(String[] args) {
        System.out.println(subsetSums(new int[]{1,2,3}));

    }

    public static List<Integer> subsetSums(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <(1<<arr.length); i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                if ((i & (1 << j)) > 0) {
                    sum += arr[j];
                }
            }
            list.add(sum);
        }
        return list;
    }
}
