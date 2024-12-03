package coder25.problemSolving1.mphasis;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.IntSupplier;

public class SecondMinimumNo {
    public static void main(String[] args) {
        int arr[]={9};
        System.out.println(get2ndMinNo(arr));

    }

    private static Object get2ndMinNo(int[] arr) {
       int x= Arrays.stream(arr).distinct().sorted().skip(1).findFirst().orElseGet(() -> 0);
return x;
    }
}
