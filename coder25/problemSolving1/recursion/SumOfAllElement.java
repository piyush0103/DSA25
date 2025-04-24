package coder25.problemSolving1.recursion;

public class SumOfAllElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        System.out.println(sum(arr,0));
    }

    private static int sum(int[] arr, int i) {
        if(i==arr.length-1){
            return arr[i];
        }
        return arr[i]+sum(arr,i+1);
    }
}
