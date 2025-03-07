package coder25.problemSolving1.Arrays.interviews;

public class SpecialIndices {
    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 7, 6, -2};
        int count = findNoSpecialIndeices(arr);
        System.out.println(count + " is this the answer");

    }

    private static int findNoSpecialIndeices(int[] arr) {
        int count = 0;
        int n = arr.length;
        int oddleft = 0;
        int evenleft = 0;
        int oddRight = 0;
        int evenRight = 0;
        int odd = 0;
        int even = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (j % 2 == 0) {
                    evenleft += arr[j];
                } else {
                    oddleft += arr[j];
                }
            }
            for (int k = i + 1; k < n; k++) {
                if (k % 2 == 0) {
                    oddRight += arr[k];
                } else {
                    evenRight += arr[k];
                }
            }
            odd = oddleft + oddRight;
            even = evenRight + evenleft;
            System.out.println(odd + " jhjhkj   " + even + "  " + i);
            if (odd == even) {
                count++;
            }
            oddleft = 0;
            evenleft = 0;
            oddRight = 0;
            evenRight = 0;

        }
        return count;
    }

}
