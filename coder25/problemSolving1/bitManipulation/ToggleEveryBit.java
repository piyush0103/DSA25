package coder25.problemSolving1.bitManipulation;

public class ToggleEveryBit {
    public static void main(String[] args) {
        int num = 10;
        printBit(num);
        System.out.println("NOW lets toggle");
        int x = toggleBit(num);
        System.out.println(x+"       dsdsd");
//        printBit(x);

    }

    private static int toggleBit(int num) {
        int rightSetBit = -1;
        int n = num;
        int count = 0;
        while (n != 0) {
            count++;
            n = n >> 1;
        }
        if (count == 0) {
            return -1;
        } else {
            int y=~(1 << (count + 1));
            System.out.println("oh    :: "+y);
            return num ^y;
        }

    }

    public static void printBit(int num) {
        int bit=0;
        StringBuilder print=new StringBuilder();
        while (num != 0) {
             bit= (num & 1) == 0 ? 0 : 1;
            print.append(bit+" ");
            num = num >> 1;
        }
        System.out.println(print.reverse());
        System.out.println();
    }
}
