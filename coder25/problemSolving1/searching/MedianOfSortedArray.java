package coder25.problemSolving1.searching;

public class MedianOfSortedArray {
    public static void main(String[] args) {
        int arr1[] = {1, 2};
        int arr2[] = {3, 4};
        System.out.println(findMedianOfSortedArrays(arr1, arr2) + " median of two sorted arrrays");
    }

    private static double findMedianOfSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n = n1 + n2;
        int leftPartition = (n1 + n2 + 1) / 2;
        int low = 0;
        int high = n1 ;
        if (n1 > n2) {
            return findMedianOfSortedArrays(arr2, arr1);
        }
        while (low <= high) {
            int mid1 = (low + high) >> 1;
            int mid2 = leftPartition - mid1;
            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE, r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;
            if (mid1 < n1) {
                r1 = arr1[mid1];
            }
            if (mid1 > 0) {
                l1 = arr1[mid1 - 1];
            }
            if (mid2 < n2) {
                r2 = arr2[mid2];
            }
            if (mid2 > 0) {
                l2 = arr2[mid2 - 1];
            }
            if (l1 <= r2 && l2 <= r1) {
                if (n % 2 == 0) {
                   return Math.max(l1, l2);
                } else {
                    return ((double)(Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
                }
            } else if (l1 > l2) {
                high = mid1 - 1;
            } else {
                low = mid1 + 1;
            }

        }
        return -1;
    }

}
