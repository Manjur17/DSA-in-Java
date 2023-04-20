package HashMaps;

import java.util.HashSet;

public class UnionOfTwoArrays {
    public static int doUnion(int[] a, int n, int[] b, int m) {
        HashSet<Integer> set = new HashSet<>();
        int i = 0, j = 0;
        while (i < n || j < m) {
            if (i < n) {
                set.add(a[i]);
                i++;
            }
            if (j < m) {
                set.add(b[j]);
                j++;
            }
        }
        return set.size();
    }
}
