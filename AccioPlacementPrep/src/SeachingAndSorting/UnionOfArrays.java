package SeachingAndSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionOfArrays {
    public static int doUnion(int[] a, int n, int[] b, int m) {
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0;
        List<Integer> ds = new ArrayList<>();
        while (i < n && j < m) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }
            if (a[i] == b[j]) {
                ds.add(a[i++]);
                j++;
            } else if (a[i] < b[j]) {
                ds.add(a[i++]);
            } else {
                ds.add(b[j++]);
            }
        }

        while (i < n) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            ds.add(a[i++]);
        }

        while (j < m) {
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }
            ds.add(b[j++]);
        }
        return ds.size();
    }
}
