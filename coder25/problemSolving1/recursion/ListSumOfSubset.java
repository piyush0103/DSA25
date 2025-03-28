package coder25.problemSolving1.recursion;

import java.util.ArrayList;
import java.util.Collections;

public class ListSumOfSubset {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        System.out.println(subsetSums(arr));
    }


    public static void func(int ind, int sum, ArrayList<Integer> arr, int N, ArrayList<Integer> sumsubset) {
        if (ind == N) {
            sumsubset.add(sum);
            return;
        }
                System.out.println(" ind "+ind );

        // Include the current element
        func(ind + 1, sum + arr.get(ind), arr, N, sumsubset);
        // Exclude the current element
        func(ind + 1, sum, arr, N, sumsubset);  // Fixed `ind=1` issue
//        System.out.println(sumsubset);
    }

    public static ArrayList<Integer> subsetSums(int[] arr) {
        int N = arr.length;  // Corrected `.size()` issue
        ArrayList<Integer> sumsubset = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        // Convert int[] to ArrayList<Integer>
        for (int num : arr) {
            arrayList.add(num);
        }
        func(0, 0, arrayList, N, sumsubset);
//        Collections.sort(sumsubset);
        return sumsubset;
    }
}

