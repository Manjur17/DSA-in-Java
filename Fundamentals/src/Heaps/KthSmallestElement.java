package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            //add k elements to the heap
            pq.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if (arr[i] < pq.peek()) {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
}
