package coder25.problemSolving1.Arrays.hashing;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayPairDivisibleBy5 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,10,6,7,8,9};
        int k=5;
        boolean doesExist=areArrayPairPresent(arr,k);
        System.out.println(doesExist+" oy");
    }

    private static boolean areArrayPairPresent(int[] arr,int k) {
        int[] freq = new int[k];
        for (int num : arr) {
            int remainder = (num % k + k) % k;
            freq[remainder]++;
        }
    if(freq[0]%2!=0){
        return false;
    }
        System.out.println(Arrays.toString(freq));
        for (int i = 1; i <= k / 2; i++) {
            if (freq[i] != freq[k - i]) return false;
        }

        return true;

    }
}