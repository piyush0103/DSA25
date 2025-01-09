package coder25.problemSolving1.mphasis.jan8;

import java.util.ArrayList;
import java.util.List;

public class MergeKSortedArrays {
    public static void main(String[] args) {
        List<Integer> sortedList1 = new ArrayList<>();
        List<Integer> sortedList2 = new ArrayList<>();
        List<Integer> sortedList3 = new ArrayList<>();
        sortedList3.add(1);
        sortedList3.add(2);
        sortedList3.add(3);
        sortedList3.add(4);
        sortedList3.add(5);
        sortedList2.add(6);
        sortedList2.add(7);
        sortedList2.add(8);
        sortedList2.add(15);
        sortedList2.add(50);
        sortedList1.add(10);
        sortedList1.add(21);
        sortedList1.add(30);
        sortedList1.add(40);
        sortedList1.add(51);
        List<List<Integer>> nSortedList = new ArrayList<>();
        nSortedList.add(sortedList2);
        nSortedList.add(sortedList1);
        nSortedList.add(sortedList3);
        List<Integer> sortedListAll = divideAndConquer(nSortedList, 0, nSortedList.size());
        System.out.println(sortedListAll);

    }

    private static List<Integer> divideAndConquer(List<List<Integer>> nSortedList, int left, int right) {
        if (left == right) {
            return nSortedList.get(left);
        }
        int mid = left + (right - left) / 2;
        List<Integer> list1 = divideAndConquer(nSortedList, left, mid);
        List<Integer> list2 = divideAndConquer(nSortedList, mid + 1, right);
        return mergeTwoArrays(list1, list2);

    }

    private static List<Integer> mergeTwoArrays(List<Integer> list1, List<Integer> list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        if (list2.size() > list1.size()) {
            mergeTwoArrays(list2, list1);
        }
        List<Integer> mergedList = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (j < list2.size()) {
            if (list1.get(i) > list2.get(j)) {
                mergedList.add(list2.get(j));
                j++;
            } else {
                mergedList.add(list1.get(i));
                i++;
            }

        }
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }
        return mergedList;

    }

}
