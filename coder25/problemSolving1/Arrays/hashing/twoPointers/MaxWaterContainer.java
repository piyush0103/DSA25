package coder25.problemSolving1.Arrays.hashing.twoPointers;


//You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//
//        Find two lines that together with the x-axis form a container, such that the container contains the most water.
//
//        Return the maximum amount of water a container can store.
//
//        Notice that you may not slant the container.
public class MaxWaterContainer {
    public static void main(String[] args) {
        int heights[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxAreaInContaiiner(heights));
    }

    private static int maxAreaInContaiiner(int[] heights) {
        int low = 0;
        int high = heights.length - 1;
        int maxArea = Integer.MIN_VALUE;
        int area = 0;
        while (low < high) {
            area = ((high - low) * Math.min(heights[low], heights[high]));
            if (heights[low] < heights[high]) {
                low++;
            } else {
                high--;
            }
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
}
