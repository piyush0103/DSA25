package coder25.problemSolving1.mphasis.dec15;

public class MaximumRecatgleBruteForce {
    public static void main(String[] args) {
        int height[] = {2, 1, 5, 6, 2, 3};
        int maxArea = findRectangleArea(height);
        System.out.println(maxArea);
    }

    private static int findRectangleArea(int[] heights) {
        int n = heights.length;
        if (n == 0) return 0;
        int maxArea = 0;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = -1;
        right[n - 1] = n;
        int prev = 0;
        for (int i = 1; i < n; i++) {
            prev = i - 1;
            if (i <= n - 1 && heights[prev] >= heights[i]) {
                prev = left[prev];
            }
            left[i] = prev;
        }
        for (int i = n - 2; i >= 0; i--) {
            prev = i + 1;
            if (i >= 0 && heights[prev] >= heights[i]) {
                prev = right[prev];
            }
            right[i] = prev;
        }
        for (int i = 0; i < n; i++) {
                maxArea = Math.max(((right[i] - left[i] - 1) * heights[i]), maxArea);
        }
        return maxArea;
    }
}
