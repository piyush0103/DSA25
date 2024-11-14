package patterns;

public class HollowSquare {
    public static void main(String[] args) {
        int start = 0;
        int end = 10;
        for (int i = 0; i <= 10; i++) {
            for (int j = start; j <= end; j++) {
                if (i == start || i == end) {
                    System.out.print("* ");
                } else {
                    if (j == 0 || j == end) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }

                }

            }
            System.out.println();
        }

    }
}
