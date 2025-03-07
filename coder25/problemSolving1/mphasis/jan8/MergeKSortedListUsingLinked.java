package coder25.problemSolving1.mphasis.jan8;

import coder25.problemSolving1.mphasis.jan8.utility.ListNode;

import java.util.List;

public class MergeKSortedListUsingLinked {
    public static void main(String[] args) {
        ListNode sortedList2 = new ListNode();
        ListNode sortedList1 = new ListNode();
        ListNode sortedList3 = new ListNode();
        sortedList1.add(10);
        sortedList1.add(20);
        sortedList1.add(30);
        sortedList2.add(1);
        sortedList2.add(2);
        sortedList2.add(50);
        sortedList3.add(-20);
        sortedList3.add(-2);
        sortedList3.add(100);
        System.out.println(sortedList1);
        System.out.println(sortedList2);
        System.out.println(sortedList3);
        ListNode[] nSortedLists = {sortedList1, sortedList2, sortedList3};
        ListNode merged = divideAndConquer(nSortedLists, 0, nSortedLists.length - 1);
        System.out.println("merged  " + "heyyy");
        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
        System.out.println();

    }

    private static ListNode divideAndConquer(ListNode[] nSortedLists, int left, int right) {
        if (left == right) {
            return nSortedLists[left];
        }
        int mid = left + (right - left) / 2;
        ListNode list1 = divideAndConquer(nSortedLists, left, mid);
        ListNode list2 = divideAndConquer(nSortedLists, mid + 1, right);
        return mergeTwoArrays(list1, list2);
    }

    private static ListNode mergeTwoArrays(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        if (list1.val < list2.val) {
            list1.next = mergeTwoArrays(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoArrays(list1, list2.next);
            return list2;
        }
    }

}

