package coder25.problemSolving1.searching;

public class ShipCapaciTyBinarySearch {
    public static void main(String[] args) {
        int arr[] = {10,50,100,100,50,100,100,100};
        int days = 5;
        System.out.println(findminCapacictyOfShip(arr, days) + "  okay");
    }

    private static int findminCapacictyOfShip(int[] arr, int days) {
        int minCapacity = 0;
        int low = arr[0];
        int high = 0;
        for (int i = 0; i < arr.length; i++) {
            high += arr[i];
            if (arr[i] > low) {
                low = arr[i];
            }
        }
        while (low <= high) {
            int capacity = 0;
            int daysNeeded = 1;
            int mid = low + (high - low) / 2;
            for (int i = 0; i < arr.length; i++) {
                capacity += arr[i];
                if (capacity > mid) {
                    capacity = arr[i];
                    daysNeeded++;
                }
            }
            if (daysNeeded == days) {
                minCapacity = mid;
                high = mid - 1;
            }
            if (daysNeeded > days) {
                low = mid + 1;
            } else {
                minCapacity=mid;
                high = mid-1 ;
            }

        }
        return minCapacity;
    }
}
