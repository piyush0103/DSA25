package coder25.problemSolving1.mphasis.dec16;

import java.util.Stack;

public class HistoGramLargestRectangle {
    public static void main(String[] args) {
        int heights[] = {2, 1, 5, 6, 2, 3};
        int maxArea = findLargestRecatngle(heights);
        System.out.println(maxArea + "    area of histogram");
    }

    private static int findLargestRecatngle(int[] heights) {
        if (heights == null) {
            return -1;
        }
        Stack<Integer> heightStack = new Stack<>();
        int n = heights.length;
        int maxArea = 0;
        for (int i = 0; i <= n; i++) {
            int currHeight = i == n ? 0 : heights[i];
            while (!heightStack.isEmpty() && currHeight < heights[heightStack.peek()]) {
                int top = heightStack.pop();
                int width = heightStack.isEmpty() ? i : i - heightStack.peek() - 1;
                int area = heights[top] * width;
                maxArea = Math.max(area, maxArea);
            }
            heightStack.push(i);
        }
        return maxArea;
    }
}
