package coder25.problemSolving1;

import java.util.Arrays;

public class FizzBuzz {
    public static void main(String[] args) {
        String arr[] = solve(10);
        Arrays.stream(arr).forEach(a-> System.out.print(a+" :: "));
    }
        static String[] solve(int n){
            String[] arr = new String[n];
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    arr[i - 1] = "fizzbuzz";

                }
                    else if (i % 3 == 0) {
                        arr[i - 1] = "fizz";
                    } else if (i % 5 == 0) {
                        arr[i - 1] = "fizz";
                    } else {
                        arr[i - 1] = String.valueOf(i);

                }
            }
return arr;
        }

}
