package coder25.problemSolving1.Arrays.interviews;

public class MajorityCandidateBoyer {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1, 2, 3, 4,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8};
        int majority = findMajority(arr);
        System.out.println(" The majority element is : "
                + majority);
    }

    private static int findMajority(int[] arr) {
        int candidate = -1;
        int count = 0;
        for (int index = 0; index < arr.length; index++) {
            if (count == 0) {
                candidate = arr[index];
                count = 1;
            } else {
                if (candidate == arr[index]) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (candidate == arr[i]) {
                count++;
            }
        }
        if (count > arr.length / 2) {
            return candidate;
        }
        return -1;
    }

}
