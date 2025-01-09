package coder25.problemSolving1.mphasis.dec15;

public class MedianUsingBinarySearch {
    public static void main(String[] args) {
        int arr1[] = {1,5,6,8};
        int arr2[] = {2,7,9,8};
        double median = new MedianUsingBinarySearch().findMedianSortedArrays(arr1, arr2);
        System.out.println(median + "        dsd");
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int total_length = n1 + n2;
        int left_partition = (total_length + 1) / 2;
        int low = 0;
        int high = n1;
        if (nums1 == null && nums2 != null) {
            int mid = (0 + n2) / 2;
            if (n2 % 2 == 0) {
                return (double) (nums2[mid] + nums2[mid + 1]) / 2.0;
            } else {
                return nums2[mid];
            }

        }
        if (nums2 == null && nums1 != null) {
            int mid = (0 + n1) / 2;
            if (n1 % 2 == 0) {
                return (double) (nums1[mid] + nums1[mid + 1]) / 2.0;
            } else {
                return nums1[mid];
            }
        }
        if (nums2 == null && nums1 == null) {
            return -1;
        }
        if (n1 > n2) {
            return findMedianSortedArrays(nums2, nums1);
        }
        while (low <= high) {
            int mid1 = (low + high) / 2;
            int mid2 = left_partition - mid1;
            int leftMid = Integer.MAX_VALUE;
            int rightMid = Integer.MAX_VALUE;
            int left = Integer.MIN_VALUE;
            int right = Integer.MIN_VALUE;
            if (mid1 < n1) {
                leftMid = nums1[mid1];
            }
            if (mid2 < n2) {
                rightMid = nums2[mid2];
            }
            if (mid1 - 1 >= 0) {
                left = nums1[mid1 - 1];
            }
            if (mid2 - 1 >= 0) {
                right = nums2[mid2 - 1];
            }
            if (leftMid >= right && rightMid >= left) {
                if (total_length % 2 == 1) {
                    return Math.max(left, right);
                } else {
                    return ((double) (Math.max(left, right) + Math.min(leftMid, rightMid)) / 2.0);
                }
            }
            if (left > rightMid) {
                high = mid1 - 1;
            }
            if (right > leftMid) {
                low = mid1 + 1;
            }

        }
        return -1;
    }
}