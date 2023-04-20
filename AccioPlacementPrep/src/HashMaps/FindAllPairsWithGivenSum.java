package HashMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class Pair {
    long first, second;

    public Pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}

public class FindAllPairsWithGivenSum {
    public Pair[] allPairs(long[] a, long[] b, long N, long M, long X) {
        HashMap<Long, Long> map = new HashMap<>();
        for (int i = 0; i < M; i++) {
            map.put(b[i], b[i]);
        }
        ArrayList<Pair> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (map.containsKey(X - a[i])) {
                list.add(new Pair(a[i], map.get(X - a[i])));
            }
        }
        Pair[] ans = new Pair[list.size()];
        int j = 0;
        for (Pair p : list) {
            ans[j++] = p;
        }
        Arrays.sort(ans, (o1 ,o2)-> (int) (o1.first - o2.first));
        return ans;
    }
}
