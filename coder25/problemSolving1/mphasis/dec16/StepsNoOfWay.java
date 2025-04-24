package coder25.problemSolving1.mphasis.dec16;

public class StepsNoOfWay {
    static int findTotalSteps(int dist) {
        int[] ways = new int[3];
        int n = dist;
        ways[0] = 1;
        ways[1] = 1;
        ways[2] = 2;

        for (int i = 3; i <= n; i++)
            ways[i % 3] = ways[(i - 1) % 3] + ways[(i - 2) % 3] + ways[(i - 3) % 3];
        return ways[n % 3];
    }


    public static void main(String arg[]) {
        int dist = 4;
        System.out.print(findTotalSteps(dist));
    }
}

