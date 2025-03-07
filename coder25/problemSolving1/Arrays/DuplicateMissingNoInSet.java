package coder25.problemSolving1.Arrays;

import java.util.Arrays;

public class DuplicateMissingNoInSet {
    public static void main(String[] args) {
        int num[] = {2, 2};
        int dupM[] = findDupMissing(num);
        System.out.println(Arrays.toString(dupM));
    }

    private static int[] findDupMissing(int[] num) {
        int dup = -1;
        int miss = -1;
        for (int i = 0; i < num.length ; i++) {
            int count = 0;
            for (int j = 0; j < num.length; j++) {
                if (num[j] == (i + 1)) {
                    count++;
                }
            }
            if (count >= 2) {
                dup = i+1;
            } else if (count == 0) {
                miss = i + 1;

            }

        }
        int arr[] = new int[2];
        arr[0] = dup;
        arr[1] = miss;
        return arr;
    }

}
