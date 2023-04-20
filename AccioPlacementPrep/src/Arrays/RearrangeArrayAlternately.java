package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArrayAlternately {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rearrange(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    public static void rearrange(long[] arr, int n){

        // Your code here
        int i = 0,j = arr.length -1;

        while(i < n){
            long temp = arr[i];
            arr[i] = arr[j];
            arr[i+1] = temp;
            i += 2;
            j--;
        }

    }
}
