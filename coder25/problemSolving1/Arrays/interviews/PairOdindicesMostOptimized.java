package coder25.problemSolving1.Arrays.interviews;

public class PairOdindicesMostOptimized {
    public static void main(String[] args) {
        int arr[] = {3, 4, 6, 9, 2};
        int n = arr.length;
        int count = 0;
        int leftcount = 0;
        int rightcount = 0;
        for (int i = 1; i < n - 1; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] > arr[j]) {
                    leftcount++;
                }

            }
            for (int k = i + 1; k < n; k++) {
                if (arr[i] < arr[k]) {
                    rightcount++;
                }

            }
            count += (leftcount * rightcount);
            leftcount = 0;
            rightcount = 0;
        }
        System.out.println("total count " + count);
    }
}


