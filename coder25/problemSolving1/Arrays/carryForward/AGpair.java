package coder25.problemSolving1.Arrays.carryForward;

public class AGpair {
    public static void main(String[] args) {
        char arr[] = {'b', 'c', 'a', 'g', 'g', 'a', 'g'};
        int pairs = getAGPair(arr);
        System.out.println("NO OF AG PAIRS " + pairs);
    }

    private static int getAGPair(char[] arr) {
        int countA = 0;
        int countG = 0;
        int pairs = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a') {
                countA++;
                countG=0;

            }
            if (arr[i] == 'g') {
                System.out.println(countA+"   "+countG);
                countG++;
                pairs +=countA;

            }

        }
        return pairs;
    }
}
