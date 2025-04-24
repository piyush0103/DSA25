package coder25.problemSolving1.recursion;

import java.util.ArrayList;
//this is wrong
public class SubSetSumRecursion {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(printSumOfSubSet(arr, 0, 0, list, 0, arr[0]));
    }

    private static ArrayList<Integer> printSumOfSubSet(int[] arr, int curr, int point, ArrayList<Integer> list, int sum1, int sum2) {
        if (curr == arr.length - 1) {
            list.add(arr[curr]);
            return list;
        }
        if (point == curr) {
            list.add(arr[curr]);
            return printSumOfSubSet(arr, curr, curr + 1, list, 0, arr[curr]);
        }
        sum1 += arr[curr] + arr[point];
        sum2=sum1;
        list.add(sum1);
        if (point == arr.length - 1) {
            list.add(sum2);
            curr++;
            return printSumOfSubSet(arr, curr, curr, list, 0, arr[curr]);
        }
        return printSumOfSubSet(arr, curr, point + 1, list, 0, sum2);

    }
}
