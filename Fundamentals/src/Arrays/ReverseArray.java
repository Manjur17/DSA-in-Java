package Arrays;

import java.util.ArrayList;

public class ReverseArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 7; i++) {
            list.add(i);
        }
        reverseArray(list,3);
        System.out.println(list);
    }
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int last = arr.size() -1;
        if(m >= last ){
            return;
        }
        m++;
        while(m < last){
            int temp = arr.get(m);
            arr.set(m, arr.get(last));
            arr.set(last, temp);
            m++;
            last--;
        }
    }
}
