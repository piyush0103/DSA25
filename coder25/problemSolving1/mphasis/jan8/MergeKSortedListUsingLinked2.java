//package coder25.problemSolving1.mphasis.jan8;
//
//import coder25.problemSolving1.mphasis.jan8.utility.ListNodes;
//
//
//public class MergeKSortedListUsingLinked2 {
//    public static void main(String[] args) {
//        ListNodes sortedList2 = new ListNodes();
//        ListNodes sortedList1 = new ListNodes();
//        ListNodes sortedList3 = new ListNodes();
//        sortedList1.add(10);
//        sortedList1.add(20);
//        sortedList1.add(30);
//        sortedList2.add(1);
//        sortedList2.add(2);
//        sortedList2.add(50);
//        sortedList3.add(-20);
//        sortedList3.add(-2);
//        sortedList3.add(100);
//        System.out.println(sortedList1);
//        System.out.println(sortedList2);
//        System.out.println(sortedList3);
//        ListNodes[] nSortedLists = {sortedList1, sortedList2, sortedList3};
//        ListNodes merged = divideAndConquer(nSortedLists, 0, nSortedLists.length - 1);
//        System.out.println("merged  " + "heyyy");
//        while (merged != null) {
//            System.out.print(merged.val + " ");
//            merged = merged.next;
//        }
//        System.out.println();
//
//    }
//
//    private static ListNodes divideAndConquer(ListNodes[] nSortedLists, int left, int right) {
//        if (left == right) {
//            return nSortedLists[left];
//        }
//        int mid = left + (right - left) / 2;
//        ListNodes list1 = divideAndConquer(nSortedLists, left, mid);
//        ListNodes list2 = divideAndConquer(nSortedLists, mid + 1, right);
//        return mergeTwoArrays(list1.head, list2.head);
//    }
//
//    private static ListNodes mergeTwoArrays(ListNodes list1, ListNodes list2) {
//        if (list1 == null) return list2;
//        if (list2 == null) return list1;
//        if (list1.val < list2.val) {
//            list1.next = mergeTwoArrays(list1.next, list2);
//            return list1;
//        } else {
//            list2.next = mergeTwoArrays(list1, list2.next);
//            return list2;
//        }
//    }
//
//}
//
