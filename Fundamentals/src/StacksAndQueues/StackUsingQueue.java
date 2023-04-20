package StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    public static void main(String[] args) {
        Stack s = new Stack();
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);

        System.out.println("current size: " + Stack.size());
        System.out.println(Stack.top());
        Stack.pop();
        System.out.println(Stack.top());
        Stack.pop();
        System.out.println(Stack.top());
        System.out.println("current size: " + Stack.size());

        StackEfficiently s1 = new StackEfficiently();
        StackEfficiently.push(1);
        StackEfficiently.push(2);
        StackEfficiently.push(3);

        System.out.println("current size: " + StackEfficiently.size());
        System.out.println(StackEfficiently.top());
        StackEfficiently.pop();
        System.out.println(StackEfficiently.top());
        StackEfficiently.pop();
        System.out.println(StackEfficiently.top());

        System.out.println("current size: " + StackEfficiently.size());
    }

    static class Stack {
        // Two inbuilt queues
        static Queue<Integer> q1 = new LinkedList<Integer>();
        static Queue<Integer> q2 = new LinkedList<Integer>();

        // To maintain current number of elements
        static int curr_size;

        Stack() {
            curr_size = 0;
        }

        static void push(int x) {
            curr_size++;

            // Push x first in empty q2
            q2.add(x);

            // Push all the remaining elements in q1 to q2.
            while (!q1.isEmpty()) {
                q2.add(q1.peek());
                q1.remove();
            }

            // swap the names of two queues
            Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;
        }

        static void pop() {
            // if no elements are there in q1
            if (q1.isEmpty())
                return;
            q1.remove();
            curr_size--;
        }

        static int top() {
            if (q1.isEmpty())
                return -1;
            return q1.peek();
        }

        static int size() {
            return curr_size;
        }
    }


    static class StackEfficiently {
        static Queue<Integer> q1 = new LinkedList<>();
        static int curr_size;

        public StackEfficiently() {
            curr_size = 0;
        }
        static void push(int x){
            q1.add(x);
            for (int i = 0; i < q1.size()-1; i++) {
                q1.add(q1.remove());
            }
            curr_size++;
        }
        static void pop() {
            // if no elements are there in q1
            if (q1.isEmpty())
                return;
            q1.remove();
            curr_size--;
        }
        static int top() {
            if (q1.isEmpty())
                return -1;
            return q1.peek();
        }
        static int size() {
            return curr_size;
        }
    }

}



