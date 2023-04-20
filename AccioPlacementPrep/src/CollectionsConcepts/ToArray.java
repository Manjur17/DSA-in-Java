package CollectionsConcepts;

import java.util.*;

public class ToArray {
    public static void main(String[] args) {
        ArrayList<Integer> ArrLis = new ArrayList<>();
        // Add elements
        ArrLis.add(32);
        ArrLis.add(67);
        ArrLis.add(98);
        ArrLis.add(100);
        // print ArrayList
        System.out.println("ArrayList: " + ArrLis);
        // Get the array of the elements of the ArrayList using toArray() method
        Object[] arr = ArrLis.toArray();
        System.out.println("Elements of ArrayList" + " as Array: " + Arrays.toString(arr));
        // Get the array of the elements of the ArrayList using toArray(T[]) method
        Integer[] arr1 = new Integer[ArrLis.size()];
        arr1 = ArrLis.toArray(arr1);
        System.out.println("Elements of ArrayList" + " as Array: " + Arrays.toString(arr1));

        Integer[] arr2 = ArrLis.toArray(new Integer[0]);
        System.out.println("Elements of ArrayList" + " as Array: " + Arrays.toString(arr2));
    }
}
