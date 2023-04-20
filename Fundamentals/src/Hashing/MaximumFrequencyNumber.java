package Hashing;

import java.util.HashMap;

public class MaximumFrequencyNumber {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 2, 2, 2, 2, 2, 6, 11, 11, 12, 12, 12};
        int[] arr ={1,4,5};
        System.out.println(maximumFrequency(arr));
    }

    private static int maximumFrequency(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for (int j : arr) {
            map.put(j,map.getOrDefault(j,0)+1);
        }
        int ans = 0,max=0;
        for (int i:arr){
            if (map.get(i) > max){
                ans = i;
                max = map.get(i);
            }
        }
        return ans;
    }
}
