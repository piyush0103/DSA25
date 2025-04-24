package coder25.problemSolving1.Arrays.carryForward;

public class SmallestSubArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 3, 4, 6, 4, 6, 3};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int distamce = 0;
        int minDistance = Integer.MAX_VALUE;
        int minIndex = -1;
        int maxindex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.printf("found max %d and min %d", max, min);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                minIndex = i;
            }
            if (arr[i] == max) {
                maxindex = i;
            }
            if (minIndex > -1 && maxindex > -1) {
                System.out.println("min index " + minIndex + " maxIndex " + maxindex);
                distamce = Math.abs(minIndex - maxindex);
                minDistance = Math.min(minDistance, distamce);
                System.out.println(" distance min " + distamce + "   === " + minDistance);

            }
            System.out.println(minDistance + "  FOUND");
        }
    }
}