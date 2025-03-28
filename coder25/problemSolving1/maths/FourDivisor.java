package coder25.problemSolving1.maths;

public class FourDivisor {
    public static void main(String[] args) {
        int arr[] = {21, 4, 7};
        int sum = findSumFourDivisor(arr);
        System.out.println(sum + " answer");
    }

    private static int findSumFourDivisor(int[] arr) {
        int sum = 0;
        for (int number : arr) {
            int currentDiv = 2;
            int sumOfCurrentDivisor = 1 + number;
            for (int j = 2; j <= Math.sqrt(number); j++) {
                if (number % j == 0) {
                    if (j == number / j) {
                        currentDiv += 1;
                        sumOfCurrentDivisor += number;
                    } else {
                        currentDiv += 2;
                        sumOfCurrentDivisor = sumOfCurrentDivisor + j + (number / j);
                    }
                }
                if (currentDiv > 4) {
                    break;
                }
            }
            if (currentDiv == 4) {
                sum += sumOfCurrentDivisor;
            }
        }
        return sum;
    }
}