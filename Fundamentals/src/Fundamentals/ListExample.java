package Fundamentals;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer>[] lists = new List[10];

        //insertion
        for (int i = 0; i < 10; i++) {
            lists[i] = new ArrayList<Integer>();
            lists[i].add(i);
            lists[i].add(i + 1);
        }

        //printing
        for (List<Integer> list : lists) {
            System.out.print(list.size() + " ");
        }
        //the lists variable points to an array data structure whose data type is List<Integer>.
        // This array contains a set of references to different objects of type List<Integer>, and this is why if we try to run lists[i]=new ArrayList<String>(); it will not compile.
        // However, when we initialize the array itself we don't need to provide the type of the List objects as List since from JVM point of view a List of Integer objects
        // and a List of Object objects will require the same number of bytes as log n as their sizes is same.
        // The only constraint comes when we set an array member to a value (of type List - it has to be List<Integer> not anything else)
        // You can type cast the List[] to a List<Integer>[] but the end result and the JVM behavior is the same.
    }
}
