package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseListUsingCollectionsFramework {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");
        //Traversing the list of elements in forward order
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        //Enhanced for loop
        for (String s : list) {
            System.out.println(s);
        }
        //Traversing the list of elements in reverse order
        Iterator<String> i = list.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
