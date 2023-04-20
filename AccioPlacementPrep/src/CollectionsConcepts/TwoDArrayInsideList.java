package CollectionsConcepts;

import java.util.*;


public class TwoDArrayInsideList {
    public static void main(String[] args) {
        List<int[]> intArrayList = Arrays.asList(new int[]{1, 2, 3}, new int[]{7, 8, 9});
        for (int[] val : intArrayList) {
            System.out.println(Arrays.toString(val));
        }

        List<int[]> list = new ArrayList<>();
        list.add(new int[]{6, 7, 8});
        list.add(new int[]{9, 11, 6});
        for (int[] val : list) {
            System.out.println(Arrays.toString(val));
        }

        int[][] arr = list.toArray(new int[0][]);
        for (int[] val : arr) {
            /*
            for (int j : val) {
                System.out.print(j + " ");
            }
            System.out.println();
            */
            System.out.println(Arrays.toString(val));
        }
        List<Integer> ds = Arrays.asList(7, 8, 9);
        System.out.println(ds);
        Integer[] arr1 = ds.toArray(new Integer[0]);

        List<List<Integer>> res = List.of(new ArrayList<>(ds), new ArrayList<>(ds));
        System.out.println(res);
    }
}
