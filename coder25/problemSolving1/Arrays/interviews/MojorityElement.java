package coder25.problemSolving1.Arrays.interviews;

public class MojorityElement {
    public static void main(String[] args) {
        int arr[] = {8, 9, 5, 6, 9, 8, 8, 9, 3, 3};
        int majorityElement = findMajorityElement(arr);
        System.out.println("majority elemnt is " + majorityElement);
    }

    private static int findMajorityElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int majorityElement = -1;
        while (start <= end) {
            if (arr[start] != arr[end]) {
                arr[start] = -1;
                arr[end] = -1;
            }
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                majorityElement = arr[i];
                break;
            }
        }
        return majorityElement;
    }
}
