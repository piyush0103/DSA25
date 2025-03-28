package coder25.problemSolving1.searching;

public class KokoBananaEatingCapacity {
    public static void main(String[] args) {
        int arr[] = {30, 11, 23, 4, 20};
        int h = 5;
        System.out.println(minEatingSpeed(arr, h));
    }

    public static int minEatingSpeed(int[] arr, int h) {
        int minCapacity = 0;
        int low = arr[0];
        int high = 0;
        for (int i = 0; i < arr.length; i++) {
            high += arr[i];
            if (arr[i] < low) {
                low = arr[i];
            }
        }
        while (low < high) {
            int capacity = 0;
            int hoursNeeded = 0;
            int mid = low + (high - low) / 2;
            for (int i = 0; i < arr.length; i++) {
                hoursNeeded += (int) (arr[i] + mid - 1) / mid;
            }
            if (hoursNeeded == h) {
                minCapacity = mid;
                high = mid - 1;
            }
            if (hoursNeeded > h) {
                low = mid + 1;

            } else if (hoursNeeded < h) {
                high = mid - 1;
            }
        }
        return minCapacity == 0 ? low : minCapacity;
    }
}
