package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidateStackSequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(validateStackSequences(arr1, arr2));
    }

    public boolean validateStackSequencesConstantSpace(int[] pushed, int[] popped) {
        /*Instead of using stack we gonna using pushed as the stack.
        Everything is, Same as above, the only difference is rather than using a new stack
        we can use the pushed ARRAY as a stack,
        using a pointer i. Initially i = 0, that means stack is empty.
        */
        int i = 0;
        int j = 0;

        for (int val : pushed) {
            pushed[i++] = val; // using pushed as the stack.
            while (i > 0 && pushed[i - 1] == popped[j]) { // pushed[i - 1] values equal to popped[j];
                i--;
                j++;
            }
        }
        return i == 0; // Since pushed is a permutation of popped so at the end we are supposed to be left with an empty stack
    }

    public boolean validateStackSequencesII(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int i = 0, j = 0;
        int n = pushed.length, m = popped.length;

        while (i < n || j < m) {
            if (st.empty() && i < n) {
                st.push(pushed[i]);
                i++;
            }
            while (i < n && st.peek() != popped[j]) {
                st.push(pushed[i]);
                i++;
            }

            if (st.peek() != popped[j]) {
                return false;
            }

            st.pop();
            j++;

        }

        return true;
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int i = 0;

        for (int num : pushed) {
            st.push(num); // insert the values in stack
            while (!st.isEmpty() && st.peek() == popped[i]) { // if st.peek() values equal to popped[j];
                st.pop(); // then pop out
                i++; // increment j
            }
        }
        return st.isEmpty(); // check if stack is empty return true else false
    }
}
