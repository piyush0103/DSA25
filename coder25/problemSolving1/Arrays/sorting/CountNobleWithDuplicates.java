package coder25.problemSolving1.Arrays.sorting;

import java.util.Arrays;

public class CountNobleWithDuplicates {
    public static void main(String[] args) {
        int arr[] = {-10, 1, 1, 3, 100};
        System.out.println(countNobleElem(arr));
    }

    private static int countNobleElem(int[] arr) {
        int count = 0;
        boolean isNobel = false;
        Arrays.sort(arr);
        if (arr[0] == 0) {
            count++;
            isNobel = true;
        }
        for (int i = 1; i < arr.length; i++) {
            ;
            if (arr[i] == i || (arr[i] == arr[i - 1] && isNobel)) {
                count++;
                isNobel = true;
            } else {
                isNobel = false;
            }

        }
        return count;
    }

}
