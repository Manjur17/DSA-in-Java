package Recursion;

import java.util.*;

public class GetStairPaths {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getStairPaths(n));
    }

    public static ArrayList<String> getStairPaths(int n) {
        ArrayList<String> ans = new ArrayList<>();
        helper(n, "", ans);
        return ans;
    }

    public static void helper(int n, String ans, ArrayList<String> list) {
        if (n == 0) {
            list.add(ans);
            return;
        }

        if (n < 0) return;

        helper(n - 1, ans + "1", list);
        helper(n - 2, ans + "2", list);
        helper(n - 3, ans + "3", list);

    }
}
