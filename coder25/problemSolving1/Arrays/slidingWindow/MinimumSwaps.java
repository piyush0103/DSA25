package coder25.problemSolving1.Arrays.slidingWindow;

//Minimum swaps required to bring all element togather 8
public class MinimumSwaps {
    public static void main(String[] args) {
        int arr[] = {10, 4, 8, 7, 8, 3, 8, -1, 8, 8};
        int elem=8;
        findMinSwap(arr,elem);
    }

    private static void findMinSwap(int[] arr, int elem) {
        int minDistrance=Integer.MAX_VALUE;
        int rightElem=0;
        int leftElem=0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]!=elem){
                leftElem=i-1;
                rightElem=i+1;

                while(leftElem>=0&&arr[leftElem]!=elem){
                    leftElem--;
                }
                while(rightElem<=arr.length&&arr[rightElem]!=elem){
                    leftElem--;
                }
//                Finding Distance
                minDistrance=Math.min((rightElem-leftElem-1),minDistrance);
            }
        }
    }
}
