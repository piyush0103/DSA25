package coder25.problemSolving1.mphasis.dec10;

public class SecondMinNo {
    public static void main(String[] args) {
        int arr[] = {111, 13, 25, 9, 34, 1};
        print2Smallest(arr);
    }

    static int print2Smallest(int arr[]) {
        int first, second, arr_size = arr.length;
        if (arr_size < 2) {
            System.out.println(" Invalid  ");
            return -1;
        }
        first = second = Integer.MAX_VALUE;
        for (int i = 0; i < arr_size; i++) {
            if (arr[i] < first) {
                second = first;
                first = arr[i];
            } else if (arr[i] < second && arr[i] != first)
                second = arr[i];
        }
        if (second == Integer.MAX_VALUE) {
            System.out.println("There is no second"
                    + "smallest element");
            return -1;
        } else
            System.out.println("The smallest element is "
                    + first
                    + " and second Smallest"
                    + " element is " + second);
        return second;
    }

}
