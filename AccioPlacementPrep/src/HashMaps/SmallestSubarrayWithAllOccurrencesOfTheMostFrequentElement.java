package HashMaps;

import java.util.*;

public class SmallestSubarrayWithAllOccurrencesOfTheMostFrequentElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(smallestSubsegment(arr, n));
    }

    static ArrayList<Integer> smallestSubsegment(int[] arr, int n) {
        // To store first occurrence of elements
        HashMap<Integer, Integer> startMap = new HashMap<>();
        // To store counts of elements
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        int highFreq = 0; //Highest frequency
        int start = 0, end = 0, currLength = 1; // end - start + 1
        for (int i = 0; i < n; i++) {

            if (freqMap.containsKey(arr[i])) {
                freqMap.put(arr[i], freqMap.get(arr[i]) + 1);
            } else {
                freqMap.put(arr[i], 1);
                startMap.put(arr[i], i); //starting point of arr[i]
            }

            int freq = freqMap.get(arr[i]);
            if (freq > highFreq) {
                highFreq = freq;
                start = startMap.get(arr[i]); //first occurrence
                end = i;
                currLength = end - start + 1;
            } else if (freq == highFreq) {
                //compare length
                int tempLength = i - startMap.get(arr[i]) + 1;
                if (tempLength < currLength) {
                    start = startMap.get(arr[i]);
                    end = i;
                    currLength = end - start + 1;
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}
