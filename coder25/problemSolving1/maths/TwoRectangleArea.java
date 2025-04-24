package coder25.problemSolving1.maths;

public class TwoRectangleArea {
    public static void main(String[] args) {
        int area = computeArea(3, 2 ,-3, 8, 0, -1, 9, 2);
        System.out.println(area + " ahoy !");
    }

    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int areaOfSqrA = Math.abs((C - A) * (D - B));
        int areaOfSqrB = Math.abs((G - E) * (H - F));
        System.out.println(areaOfSqrA+"   ojjhj");
        int left = Math.max(A, E);
        int right = Math.min(G, C);
        int bottom = Math.max(F, B);
        int top = Math.min(D, H);
        //If overlap
        int overlap = 0;
        if (right > left && top > bottom) overlap = (right - left) * (top - bottom);
        return areaOfSqrA + areaOfSqrB - overlap;
    }
}