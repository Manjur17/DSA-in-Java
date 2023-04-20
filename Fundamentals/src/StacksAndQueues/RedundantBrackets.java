package StacksAndQueues;

import javax.security.sasl.SaslClient;
import java.util.Scanner;
import java.util.Stack;

public class RedundantBrackets {
    public static boolean findRedundantBrackets(String str)
    {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch =='+' || ch == '-' || ch == '*' || ch == '/'){
                //push it into the stack
                st.push(ch);
            }else{
                if (ch == ')'){
                    //Now find an operator between '(' and ')'
                    boolean isRedundant = true;
                    while (st.peek() != '('){
                        char top = st.peek();
                        if (top =='+' || top == '-' || top == '*' || top == '/'){
                            isRedundant = false;
                        }
                        st.pop(); //now pop the alphabets or the operator
                    }
                    if (isRedundant){
                        return true;
                    }
                    //Now check for remaining expression
                    st.pop();
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        boolean ans = findRedundantBrackets(str);
        System.out.println(ans);
    }
}
