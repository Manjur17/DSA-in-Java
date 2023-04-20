package StacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class MinimumCostToMakeStringValid {
    public static int findMinimumCost(String str) {
        Stack<Character> st = new Stack<>();
        if (str.length() %2 == 1){
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '{'){
                st.push(ch);
            }else{
                //if ch == '}". Now remove all the valid expressions otherwise push it
                if (!st.empty() && st.peek() == '{'){
                    st.pop();
                }else{
                    st.push(ch);
                }
            }
        }
        //Now we have all invalid expressions
        int a = 0,b =0;
        //b is no of opening brackets and a is no of closing brackets
        while (!st.empty()){
            if (st.peek() == '{'){
                b++;
            }else{
                a++;
            }
            st.pop();
        }
        return (a+1)/2 + (b+1)/2;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(findMinimumCost(str));
    }
}
