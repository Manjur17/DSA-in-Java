package OOPS.Wildcards;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildcards {
    public static void display(List<?> list) {
        //as type is unknown we must use object class object to print the list
        for (Object o : list) {
            System.out.print(o + " ");
        }
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        System.out.println("Displaying the integer value");
        display(list);
        List<String> list1 = Arrays.asList("one", "two", "three");
        System.out.println("Displaying the strings value");
        display(list1);
    }
}