package coder25.problemSolving1.Arrays.hashing.twoPointers;

public class TripletsMinDiff {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 8, 10};
        int[] arr2 = {16, 19, 115};
        int[] arr3 = {2, 3, 6, 6};
        int result = findMinDiff(arr1, arr2, arr3);
        System.out.println(result);
    }

    private static int findMinDiff(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        int minDiff = Integer.MAX_VALUE;
        //
        while (i < arr1.length && j < arr2.length && k < arr3.length) {

            int maxVal = Math.max(arr1[i], Math.max(arr2[j], arr3[k]));
            int minVal = Math.min(arr1[i], Math.min(arr2[j], arr3[k]));
            // Update minimum difference if current difference is smaller
            minDiff = Math.min(minDiff, maxVal - minVal);
            // Move the pointer of array containing minimum value
            if (arr1[i] == minVal)
                i++;
            else if (arr2[j] == minVal)
                j++;
            else if (arr2[j] == minVal)
                k++;
        }
        return minDiff;
    }
}