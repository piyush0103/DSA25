package coder25.problemSolving1.mphasis.jan8;

import java.util.*;

public class TopKFrequent {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int freq[] = findTopKFreq(arr, k);
    }

    private static int[] findTopKFreq(int[] arr, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        ArrayList<Map.Entry<Integer, Integer>> entryList = new ArrayList(freq.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        System.out.println(entryList);
        int freqs[] = new int[k];
        for (int i = 0; i < k; i++) {
            freqs[i] = entryList.get(i).getKey();
        }
        return freqs;
    }

}
