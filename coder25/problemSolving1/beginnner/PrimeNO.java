package coder25.problemSolving1.beginnner;

public class PrimeNO {
    public static void main(String[] args) {
        int n = 5;
        String msg = isPrime(n);
        System.out.println(msg);
        for (int i = 0; i < 100; i++) {
            System.out.println(isPrime(i));
        }
    }

    private static String isPrime(int n) {
        String msg;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return msg = n + " is not a prime no ";
            }
        }
        return msg = n + " is  a prime no ";
    }
}
