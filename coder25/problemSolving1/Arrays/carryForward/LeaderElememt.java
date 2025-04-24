package coder25.problemSolving1.Arrays.carryForward;

public class LeaderElememt {
    public static void main(String[] args) {
        int array[] = {2, 5, 3, 4, 17, 16};
        int max = array[0];
        int leaderCount = 1;
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                leaderCount++;
                max = array[i];
            }
        }
        System.out.println(leaderCount);

    }
}
