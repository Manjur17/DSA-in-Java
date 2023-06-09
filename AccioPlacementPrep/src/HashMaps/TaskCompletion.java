package HashMaps;

import java.util.*;

public class TaskCompletion {
    public static void completeTask(int n, int m, int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int val : arr) {
            set.add(val);
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        boolean flag = true;
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                if (flag) {
                    list1.add(i);
                } else {
                    list2.add(i);
                }
                flag = !flag;
            }
        }

        for (int a : list1) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int a : list2) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    // Don't make changes here
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[] num = new int[m];
        for (int i = 0; i < m; i++) {
            num[i] = scn.nextInt();
        }
        completeTask(n, m, num);
    }
}
