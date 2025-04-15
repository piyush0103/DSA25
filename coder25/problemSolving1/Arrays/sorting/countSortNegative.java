package coder25.problemSolving1.Arrays.sorting;

import java.util.Arrays;

public class countSortNegative {
    public static void main(String[] args) {
        int unsortedArray[] = {-30,-10,-6,9,2,2,2};
        int sortedArray[] = countingSort_enhanced(unsortedArray);
        System.out.println(Arrays.toString(sortedArray));

    }

    static int[] countingSort_enhanced(int input[]) {
        // Find the smallest element (to account for negative values)
        int min = Arrays.stream(input).min().getAsInt();
        // Shift all values in the input by the min value
        input = Arrays.stream(input).map(a -> a - min).toArray();
        // Find the maximum element in the array
        int max = Arrays.stream(input).max().getAsInt();
        // Create a count array to store the frequency of each element
        int count[] = new int[max + 1];
        // Count the occurrences of each element
        for (int num : input) {
            count[num]++;
        }
        // Calculate prefix sum to store the position of
        // each element in the sorted array
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }
        // Create an output array to store the sorted elements
        int output[] = new int[input.length];
        // Place elements in the output array based on counts
        for (int i = input.length - 1; i >= 0; i--) {
            output[count[input[i]] - 1] = input[i];
            count[input[i]]--;
        }
        output = Arrays.stream(output).map(a -> a + min).toArray();
        // Return the sorted array
        return output;
    }
}