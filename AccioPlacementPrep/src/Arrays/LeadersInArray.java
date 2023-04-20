package Arrays;

import java.util.*;

public class LeadersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = leaders(arr, n);
        System.out.println(list);
    }

    static ArrayList<Integer> leaders(int[] arr, int n) {
        int item = arr[n - 1];
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(item);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= item) {
                list.add(arr[i]);
                item = Math.max(item, arr[i]);
            }
        }
        //reverse the list
        int sI = 0, eI = list.size() - 1;
        while (sI < eI) {
            int temp = list.get(sI);
            list.set(sI, list.get(eI));
            list.set(eI, temp);
            sI++;
            eI--;
        }
        return list;
    }
}
