package StacksAndQueues;

import java.util.Stack;

public class DeleteMiddleElementFromStack {
    public static void solution(Stack<Integer> inputStack,int count, int N){
        if (count == N/2){
            inputStack.pop();
            return;
        }
        int num = inputStack.peek();
        inputStack.pop();
        solution(inputStack,count+1,N);
        inputStack.push(num);
    }

    public static void deleteMiddle(Stack<Integer> inputStack, int N) {
        int count = 0;
        solution(inputStack,count,N);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        deleteMiddle(st,st.size());
        System.out.println(st.size());
        int n = st.size();
        for (int i = 0; i < n; i++) {
            System.out.print(st.peek() + " -> ");
            st.pop();
        }
        System.out.println("END");
        System.out.println(st.size());
    }
}
