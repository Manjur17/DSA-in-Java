package Heaps;

import java.util.PriorityQueue;

public class KLargestElement {
    public static void Klargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0;i<arr.length;i++){
            if (i<k){
                pq.add(arr[i]);
            }else {
                if (!pq.isEmpty() && arr[i] > pq.peek()){
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }
        while (!pq.isEmpty()){
            System.out.print(pq.poll() + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,10,5,17,7,18,64};
        Klargest(arr,3);
    }
}
