package Stack;

import java.util.Scanner;
import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] arr = new int[n][n];
        //Taking input from user
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println(celebrity(arr, n));
        int[][] M = {{0, 0, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 0},
                {0, 0, 1, 0}};

        int celebIdx = celebrity2(M, 4);

        if (celebIdx == -1)
            System.out.println("No celebrity found!");
        else {
            System.out.println("0-based celebrity index is : " + celebIdx);
        }
    }

    public static int celebrity2(int[][] arr, int n) {
        int i = 0, j = n - 1;
        while (i < j) {
            if (arr[j][i] == 1) // j knows i
                j--;
            else // j doesn't know i so i can't be celebrity
                i++;
        }
        // i points to our celebrity candidate
        int candidate = i;

        // Now, all that is left is to check that whether
        // the candidate is actually a celebrity i.e: he is
        // known by everyone, but he knows no one
        for (i = 0; i < n; i++) {
            if (i != candidate && (arr[i][candidate] == 0 || arr[candidate][i] == 1))
                return -1;
        }
        // if we reach here this means that the candidate is really a celebrity
        return candidate;
    }

    static int celebrity(int[][] arr, int n) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            st.push(i); //put all celebrity inside stack
        }

        while (st.size() != 1) {
            int a = st.pop();
            int b = st.pop();
            if (arr[a][b] == 1) {
                st.push(b); //A knows B
            } else if (arr[b][a] == 1) {
                st.push(a); //B knows A
            }
        }
        //now st.size = 1
        int ans = st.pop();
        if (isCelebrity(arr, ans, n))
            return ans;

        return -1;
    }

    private static boolean isCelebrity(int[][] arr, int candidate, int n) {
        for (int i = 0; i < n; i++) {
            if (i != candidate && (arr[i][candidate] == 0 || arr[candidate][i] == 1))
                return false;
        }
        return true;
    }
}
