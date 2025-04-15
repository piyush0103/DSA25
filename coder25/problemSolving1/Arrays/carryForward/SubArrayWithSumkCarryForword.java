package coder25.problemSolving1.Arrays.carryForward;

import java.util.Arrays;
import java.util.HashMap;

public class SubArrayWithSumkCarryForword {
    public static void main(String[] args) {
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int target = 23;
        int coOrdinates[] = findSubArrayWithSumkCarry(arr, target);
        System.out.println(Arrays.toString(coOrdinates) + " okaok");
    }

    private static int[] findSubArrayWithSumkCarry(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int res[] = {-1};
        int s = 0, l = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum - target == 0) {
                res = new int[]{s, i};
                break;
            }
            if (map.containsKey(sum - target)) {
                s = map.get(sum - target);
                l = i;
                res = new int[]{s, l};
                break;
            }
            map.put(sum, i);

        }
        System.out.println(map);
        return res;
    }
}
