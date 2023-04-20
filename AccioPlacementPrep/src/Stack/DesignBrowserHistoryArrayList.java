package Stack;

import java.util.ArrayList;

public class DesignBrowserHistoryArrayList {
    ArrayList<String> list;
    int index;

    public DesignBrowserHistoryArrayList(String homepage) {
        list = new ArrayList<>();
        index = 0;
        list.add(homepage);
    }

    public void visit(String url) {
        //set method only sets value not create new one
        //if an element is not there, and we want to set value at that index then it will through IndexOutOfBound exception
        list.subList(index + 1, list.size()).clear();
        list.add(url);
        index++;
    }

    public String back(int steps) {
        index = steps > index ? 0 : index - steps;
        return list.get(index);
    }

    public String forward(int steps) {
        //last index is list.size() - 1
        index = steps > list.size() - 1 - index ? list.size() - 1 : index + steps;
        return list.get(index);
    }

}
