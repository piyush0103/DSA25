package coder25.problemSolving1.Arrays.slidingWindow;


//GIven an array find start and end index of all subarray with length k
public class StartAndEndIndex {
    public static void main(String[] args) {
        int arr[] = {1, 5, 6, 42, 7, 6, 1, 9, 33, 77};
        int length = 3;
        int start = 0;
        int end = start + length;
        while (end < arr.length) {
            System.out.println("START :" + start + "   " + "END :" + end);
            start++;
            end++;
        }

    }

}
