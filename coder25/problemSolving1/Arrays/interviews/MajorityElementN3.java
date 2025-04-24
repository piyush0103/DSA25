package coder25.problemSolving1.Arrays.interviews;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementN3 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 1, 3, 2, 1, 1};
        List<Integer> res = findMajority(arr);
        for (int ele : res) {
            System.out.print(ele + " majority element  ");
        }
    }

    private static List<Integer> findMajority(int[] arr) {
        int elem1 = -1;
        int elem2 = -1;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (elem1 == arr[i]) {
                count1++;

            } else if (elem2 == arr[i]) {
                count2++;
            } else if (count1 == 0) {
                elem1 = arr[i];
                count1++;
            } else if (count2 == 0) {
                elem2 = arr[i];
                count2++;
                System.out.println(elem1 + "  xx " + elem2);

            } else {
                count1--;
                count2--;
            }

        }
        System.out.println(elem1 + "  ----  " + elem2);
        List<Integer> majority = new ArrayList<>();
        count1 = 0;
        count2 = 0;
        for (int elem : arr) {
            if (elem == elem1) {
                count1++;
            } else if (elem == elem2) {
                count2++;

            }
        }
        if (count1 > arr.length / 3) {
            majority.add(elem1);
        }
        if (count2 > arr.length / 3) {
            majority.add(elem2);
        }
        return majority;

    }
}
