package StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKelementsQueue {
    public static void reverseKElements(Queue<Integer> queue, int k){
        if (queue.isEmpty() || k > queue.size() || k <= 0){
            return;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }
        //Now put the elements back to queue
        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }
        //Now Enqueue and Dequeue (n-k) elements
        for (int i = 0; i < queue.size()-k; i++) {
            queue.add(queue.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        reverseKElements(queue, 3);
        int n = queue.size();
        for (int i = 0; i < n; i++) {
            System.out.print(queue.peek() + " <- ");
            queue.remove();
        }
        System.out.println("END");
    }
}
