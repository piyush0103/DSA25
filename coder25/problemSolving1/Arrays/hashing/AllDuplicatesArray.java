package coder25.problemSolving1.Arrays.hashing;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicatesArray {
    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> dup = findAllDuplicate(arr);
        System.out.println(dup);
    }

    private static List<Integer> findAllDuplicate(int[] arr) {
            List<Integer> dup = new ArrayList<>();
            int n = arr.length;
            int hashed[] = new int[n + 1];
            for (int x : arr) {
                hashed[x]++;
            }
            for (int i = 1; i < hashed.length; i++) {
                if (hashed[i] >= 2) {
                    dup.add(i);
                }
            }
            return dup;
        }
    }
