package HashMaps;

import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) throws java.lang.Exception {
        //your code here
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size]; //creating the array
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(duplicateElements(arr));
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    private static boolean duplicateElements(int[] arr) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int j : arr) {
            if (!map.containsKey(j)) {
                map.put(j, true);
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean duplicateElementsBrute(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < (size - 1); i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
