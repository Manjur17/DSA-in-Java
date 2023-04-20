package StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseAQueue {
    public static void reverseIterative(Queue<Integer> queue){
        if (queue.isEmpty()){
            return;
        }
        Stack<Integer> st = new Stack<>();
        while (!queue.isEmpty()){
            st.push(queue.remove());
        }
        while (!st.isEmpty()){
            queue.add(st.pop());
        }
    }
    public static void reverseQueueRecursive(Queue<Integer> queue) {
        if (queue.isEmpty()){
            return;
        }
        int num = queue.peek();
        queue.remove();
        //Recursion to reverse the remaining stack
        reverseQueueRecursive(queue);
        //Push it back
        queue.add(num);
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
//        reverseIterative(queue);
        reverseQueueRecursive(queue);
        int n = queue.size();
        for (int i = 0; i < n; i++) {
            System.out.print(queue.peek() + " <- ");
            queue.remove();
        }
        System.out.println("END");
    }
}
