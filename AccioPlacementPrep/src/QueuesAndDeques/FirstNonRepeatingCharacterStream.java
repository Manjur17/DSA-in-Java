package QueuesAndDeques;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class FirstNonRepeatingCharacterStream {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(FirstNonRepeating(s));
    }

    public static String FirstNonRepeating(String s) {
        // code here
        int[] frequency = new int[26];
        Queue<Character> q = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            frequency[ch - 'a']++; //storing frequency of current char in the stream
            q.add(ch);//storing non repeating char
            while (!q.isEmpty()) {
                if (frequency[q.peek() - 'a'] > 1) {
                    //repeating character
                    q.poll(); //our queue will have non repeating char for the current stream
                } else {
                    //non repeating char
                    sb.append(q.peek());
                    break;
                }
            }
            if (q.isEmpty()) {
                //we don't have any non repeating char for the current stream
                sb.append('#');
            }
        }
        return sb.toString();
    }
}
