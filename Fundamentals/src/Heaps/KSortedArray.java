package Heaps;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KSortedArray {
    public static int[] arrayFunction() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void nearlySorted(int[] array, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k + 1; i++) {
            //add k+1 elements to the heap
            pq.add(array[i]);
        }
        int idx = 0;
        for (int i = k + 1; i < array.length; i++) {
            array[idx++] = pq.poll();
            pq.add(array[i]);
        }
        //remaining elements' int the PQ
        while (!pq.isEmpty()) {
            array[idx++] = pq.poll();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = arrayFunction();
        int k = s.nextInt();
        nearlySorted(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}
