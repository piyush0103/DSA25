package coder25.problemSolving1.Arrays.subArrays;

public class PrintAllSubArray {
    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 9, 7, 8};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" [ ");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + ",");
                }
                System.out.print(" ] ");
            }
            System.out.println();

        }
    }
}
