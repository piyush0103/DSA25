package coder25.problemSolving1.Arrays.interviews;

public class PairIndicesOptimized {
    public static void main(String[] args) {
        int arr[] = {3, 4, 6, 9, 2};
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    for (int k = j + 1; k < n; k++) {
                        if (arr[i] < arr[k] && arr[j] < arr[k]) {
                            System.out.println(arr[i] + " < " + arr[j] + " <" + arr[k] + "   triplets iner pair");
                            count++;
                        }

                    }
                }

            }
        }
        System.out.println("total count " + count);
    }
}
