package QueuesAndDeques;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(4);
        q.add(3);
        q.add(1);
        q.add(10);
        q.add(2);
        q.add(6);
        Queue<Integer> ans = rev(q);
        System.out.println();
        while (!ans.isEmpty()){
            System.out.println(ans.poll());
        }

    }
    public static Queue<Integer> rev(Queue<Integer> q) {
        //add code here.
        reverse(q);
        return q;
    }

    private static void reverse(Queue<Integer> q) {
        if (q.isEmpty()){
            return;
        }
        int val = q.poll();
        reverse(q);
        q.add(val);
    }

}
