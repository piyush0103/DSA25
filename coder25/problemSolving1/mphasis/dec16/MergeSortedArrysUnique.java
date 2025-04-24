package coder25.problemSolving1.mphasis.dec16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MergeSortedArrysUnique {
    public static void main(String[] args) {
        int arr1[] = {1, 4, 8, 9};
        int arr2[] = {9, 15, 20};
        int arr3[] = {4, 8, 40, 96, 100};
        List<List<int[]>> listofList = Arrays.asList(Arrays.asList(arr1), Arrays.asList(arr2), Arrays.asList(arr3));
     int merged[]= listofList.stream().flatMap(a -> a.stream()).flatMapToInt(d->Arrays.stream(d)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(merged));

    }
}
