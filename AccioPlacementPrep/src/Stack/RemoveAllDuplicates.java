package Stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveAllDuplicates {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        System.out.println(removeDuplicates(s1));
    }

    public static String removeDuplicates(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!stack.isEmpty() && stack.peek() == ch)
                stack.pop();
            else
                stack.push(ch);
        }

        while (!stack.isEmpty())
            res.append(stack.pop());

        return res.reverse().toString();

    }
}
