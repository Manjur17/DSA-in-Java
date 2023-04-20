package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(lastIndex(arr,x,0));
    }

    private static int lastIndex(int[] arr, int x, int index) {
        if (index == arr.length){
            return -1;
        }
        int lI = lastIndex(arr,x,index+1);
        if (lI == -1){
            if (arr[index] == x){
                return index;
            }else {
                return -1;
            }
        }else {
            return lI;
        }
    }
}
