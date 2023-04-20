package QueuesAndDeques;

import java.util.*;

public class InterleaveTheQueue {
    public static void interLeaveQueueUsingStack(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        int halfSize = q.size() / 2;

        // Push first half elements into the stack : queue : 11 12 13 14 15 16 17 18
        // queue:15 16 17 18  stack:  14 13 12 11
        for (int i = 0; i < halfSize; i++) {
            s.push(q.peek());
            q.poll();
        }

        // add back the stack elements to queue
        // queue: 15 16 17 18 14 13 12 11
        while (!s.empty()) {
            q.add(s.peek());
            s.pop();
        }

        // dequeue the first half elements of queue and enqueue them back
        // queue: 14 13 12 11 15 16 17 18
        for (int i = 0; i < halfSize; i++) {
            q.add(q.peek());
            q.poll();
        }

        // Again push the first half elements into the stack
        // queue: 15 16 17 18, stack: 11 12 13 14
        for (int i = 0; i < halfSize; i++) {
            s.push(q.peek());
            q.poll();
        }

        // interleave the elements of queue and stack
        // queue: 11 15 12 14 13 17 14 18
        while (!s.empty()) {
            q.add(s.peek());
            s.pop();
            q.add(q.peek());
            q.poll();
        }
    }
    public static void interLeaveQueue(Queue<Integer> q) {
        // Write your code here.
        int k = q.size() / 2;
        Queue<Integer> newQ = new LinkedList<>();
        while (k-- > 0) {
            newQ.add(q.poll());
        }
        while (!newQ.isEmpty()) {
            q.add(newQ.poll());
            q.add(q.poll());
        }
    }
}
