package QueuesAndDeques;

import java.util.*;

public class ReverseFirstKElementsOfQueue {
    public static void main(String[] args) throws java.lang.Exception {
        //your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            q.add(val);
        }
        Queue<Integer> ans = modifyQueue(q, k);
        while (!ans.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
    }

    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();

        //put first k element inside stack
        for (int i = 0; i < k; i++) {
            st.push(q.poll());
        }

        //push stack elements back to queue
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        //append first n - k at last of queue
        for (int i = 0; i < q.size() - k; i++) {
            q.add(q.poll());
        }

        return q;
    }
}
