package CollectionsConcepts;

import java.util.*;

public class ReverseArrayUsingCollections {
    public static void main(String[] args) {
        Integer[] arr = {2,3,4,5,6};
        Collections.reverse(Arrays.asList(arr)); //works only over wrapper class
        System.out.println(Arrays.toString(arr));
    }
}
