package coder25.problemSolving1.Arrays.subArrays;

public class SumOfAllSubArrayOptimed {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3,4};
        int sum = 0;
        int freq = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            freq = (n - i) * (i + 1);
            sum += freq * arr[i];
        }
        System.out.println(" sum of all sub array " + sum);
    }
}
