package coder25.problemSolving1.mphasis.dec13;

import java.util.LinkedHashSet;
import java.util.Set;

public class LoopInArray {


    public static void main(String[] args) {
        int[] arr = {1, 4,5,2,1,2};
        int result = checkLoop(arr);
        System.out.println(result);
    }

    private static int checkLoop(int[] arr) {
        int n = arr.length;
        Set<Integer> visited = new LinkedHashSet<>();
        int curr = 0;
        int i = 0;
        int nexpos = 0;
        while (i < n) {
            curr = curr % n;
            nexpos = arr[curr]%n;
            if (visited.contains(nexpos)) {
                return curr - nexpos + 1;
            }
            if (arr[curr] == 0 || curr == (curr + arr[curr]) % n) {
            }
            visited.add(curr);
            curr = arr[curr];

        }
        return -1;
    }
}
