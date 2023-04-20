package HashMaps;

import java.util.*;

public class FindMissingInSecondArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        List<Integer> list = missingNumbers(arr1, arr2);
        for (int val : list) {
            System.out.print(val + " ");
        }
    }

    public static List<Integer> missingNumbers(int[] a, int[] b) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : a) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        for (int val : b) {
            if (!map.containsKey(val)) {
                list.add(val);
            }
        }

        return list;
    }

    public static List<Integer> missingNumbers2(int[] a, int[] b) {
        Set<Integer> ds = new HashSet<>();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int j : a) {
            map1.put(j, map1.getOrDefault(j, 0) + 1);
        }

        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int j : b) {
            map2.put(j, map2.getOrDefault(j, 0) + 1);
        }

        for (int val : b) {
            if (!map1.containsKey(val) || !map2.get(val).equals(map1.get(val))) {
                ds.add(val);
            }
        }

        List<Integer> list = new ArrayList<>(ds);
        Collections.sort(list);
        return list;
    }
}
