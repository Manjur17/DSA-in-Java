package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArrayAfterMPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverseFunc(arr,m);
    }

    private static void reverseFunc(int[] arr,int m) {
        int last = arr.length-1;
        if(m >= last ){
            return;
        }
        m++;
        while(m < last){
            int temp = arr[m];
            arr[m] = arr[last];
            arr[last] = temp;
            m++;
            last--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
