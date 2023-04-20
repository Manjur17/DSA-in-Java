package OOPS.Wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoundedWildcards {
    //Upper Bound
    public static double sumArrayUpperBound(ArrayList<? extends Number> num){
        double sum = 0.0;
        for (Number n:num){
            sum += n.doubleValue();
        }
        return sum;
    }
    //Lower Bound
    public static void displayLowerBound(List<? super Integer> list){
        for (Object O: list){
            System.out.print(0 + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        System.out.println("Displaying the sum = " +  sumArrayUpperBound(l1));

        ArrayList<Double> l2 = new ArrayList<>();
        l2.add(34.4);
        l2.add(21.0);
        System.out.println("Displaying the sum = " +  sumArrayUpperBound(l2));

        List<Integer> list = Arrays.asList(1, 2, 3);
        System.out.println("Displaying the integer value");
        displayLowerBound(list);
        List<Number> list1 = Arrays.asList(1.0, 2.2, 3.3);
        System.out.println("Displaying the Number value");
        displayLowerBound(list1);
    }
}
