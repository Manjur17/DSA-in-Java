package QueuesAndDeques;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateNumberWithGivenDigits {
    public static void main(String[] args) {
        generateN(10);
    }

    static void generateN(int n) {
        int a = 5, b = 6;
        Queue<String> q = new LinkedList<>();
        q.add(a + "");
        q.add(b + "");
        for (int i = 0; i < n; i++) {
            String curr = q.poll();
            System.out.print(curr + " ");
            q.add(curr + "5");
            q.add(curr + "6");
        }
    }
}
