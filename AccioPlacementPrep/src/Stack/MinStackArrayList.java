package Stack;

import java.util.*;

public class MinStackArrayList {
    ArrayList<Integer> list;
    ArrayList<Integer> minList;

    public MinStackArrayList() {
        list = new ArrayList<>();
        minList = new ArrayList<>();
    }

    public void push(int val) {
        if (list.isEmpty()) {
            list.add(val);
            minList.add(val);
        } else {
            int min = Math.min(val, minList.get(minList.size() - 1));
            list.add(val);
            minList.add(min);
        }
    }

    public void pop() {
        list.remove(list.size() - 1);
        minList.remove(minList.size() - 1);
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int getMin() {
        return minList.get(minList.size() - 1);
    }
}
