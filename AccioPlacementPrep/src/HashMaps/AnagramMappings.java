package HashMaps;

import java.util.*;

public class AnagramMappings {
    public static int[] anagramMappings(int[] A, int[] B) {
        int[] ans = new int[A.length];
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>(); //<B[i] , list of all indices >
        for (int i = 0; i < B.length; i++) {
            ArrayList<Integer> list = map.getOrDefault(B[i], new ArrayList<>());
            list.add(i);
            map.put(B[i], list);
        }

        for (int i = 0; i < A.length; i++) {
            ArrayList<Integer> list = map.get(A[i]);
            ans[i] = list.get(0);
            list.remove(0);
        }

        return ans;
    }
}
