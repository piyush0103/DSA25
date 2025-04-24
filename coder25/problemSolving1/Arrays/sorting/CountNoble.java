package coder25.problemSolving1.Arrays.sorting;

import java.util.Arrays;

public class CountNoble {
    public static void main(String[] args) {
        int arr[] = {-10, 1, 1, 3, 100};
        System.out.println(countNobelElement(arr));
    }

    private static int countNobelElement(int[] arr) {
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i == arr[i]) {
                System.out.println(i+"   "+arr[i]);
                count++;
            }
        }
        return count;
    }
}
