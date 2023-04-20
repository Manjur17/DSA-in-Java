package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,3,2,2,3,2,6,2,5};
        ArrayList<Integer> list = removeDuplicates(arr);
        System.out.println(list);
    }

    private static ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer,Boolean> map = new HashMap<>();
        for (int j : arr) {
            if (map.containsKey(j)) {
                continue;
            }
            output.add(j);
            map.put(j, true);
        }
        return output;
    }
}
