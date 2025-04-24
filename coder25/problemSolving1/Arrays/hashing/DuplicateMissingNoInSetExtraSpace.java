package coder25.problemSolving1.Arrays.hashing;

import java.util.Arrays;

public class DuplicateMissingNoInSetExtraSpace {

    public static void main(String[] args) {
        int num[] = {2, 2};
        int dupM[] = findDupMissing(num);
        System.out.println(Arrays.toString(dupM));
    }

    private static int[] findDupMissing(int[] num) {
        int n = num.length;
        int hashed[] = new int[n + 1];
        int miss = -1;
        int dup = -1;
        for (int i = 0; i < n; i++) {
            hashed[num[i]]++;

        }
        for (int i = 0; i < hashed.length; i++) {
            if (hashed[i] == 0) {
                miss = i;
            }
            if (hashed[i] == 2) {
                dup = i;
            }
        }
        int arr[] = new int[2];
        arr[0] = dup;
        arr[1] = miss;
        return arr;
    }

}
