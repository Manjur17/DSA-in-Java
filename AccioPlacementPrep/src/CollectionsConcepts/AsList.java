package CollectionsConcepts;

import java.util.*;

public class AsList {
    public static void main(String[] args) {
        String[] s = new String[]{"A", "B", "C", "D"};
        // Getting the list view of Array
        List<String> list = Arrays.asList(s);
        // Printing all the elements in list object
        System.out.println("The list is: " + list);

        Integer[] a = new Integer[] { 10, 20, 30, 40 };
        // Getting the list view of Array
        List<Integer> list1 = Arrays.asList(a);
        // Printing all the elements inside list object
        System.out.println("The list is: " + list1);
    }
}
