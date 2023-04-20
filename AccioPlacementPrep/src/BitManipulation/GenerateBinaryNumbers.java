package BitManipulation;

import java.util.*;

public class GenerateBinaryNumbers {
    static ArrayList<String> generate(int n) {
        ArrayList<String> list = new ArrayList<String>();
        Queue<String> q = new LinkedList<>();
        q.add(1 + "");
        for (int i = 0; i < n; i++) {
            String curr = q.poll();
            list.add(curr);
            q.add(curr + "0");
            q.add(curr + "1");
        }

        return list;
    }
}
