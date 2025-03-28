package coder25.problemSolving1.bitManipulation;

public class SingleNo2 {
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,1,2,3};
        int singleNo = findSingleNumber(arr);
        System.out.println("single no is " + singleNo);
    }

    private static int findSingleNumber(int[] arr) {
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            sum = 0;
            for (int num : arr) {
                sum += num >> i & 1;
            }
            sum %= 3;
            ans += sum << i;
        }
        return ans;
    }

}

