package Recursion;

import java.util.*;


public class EliminationGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(lastRemaining(n));
        System.out.println(lastRemainingEfficient(n));
    }

    public int lastRemainingIterative(int n) {
        int start = 1, step = 1, remain = n;
        boolean right = true;
        while (remain > 1) {
            if (right || remain % 2 == 1)
                start += step;
            remain /= 2;
            step *= 2;
            right = !right;
        }
        return start;
    }

    public static int lastRemainingEfficient(int n) {
        if (n == 1) {
            return 1;
        }

        return 2 * (1 + n / 2 - lastRemaining(n / 2));
    }

    public static int lastRemaining(int n) {
        if (n == 1 || n == 2)
            return n;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        return helper(1, n, list);
    }

    private static int helper(int i, int n, List<Integer> list) {
        if (n == 1) {
            return list.get(0);
        }
        if (i % 2 != 0) {
            for (int j = 0; j < n; j += 2) {
                list.set(j, 0);
            }
        } else {
            for (int j = n - 1; j >= 0; j -= 2) {
                list.set(j, 0);
            }
        }
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            int x = itr.next();
            if (x == 0)
                itr.remove();
        }
        return helper(i + 1, list.size(), list);
    }
}
