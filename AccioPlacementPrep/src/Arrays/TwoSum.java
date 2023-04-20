package Arrays;

import java.util.Scanner;

public class TwoSum {
    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        for (int p = 0; p < n; p++) {
            arr[p] = sc.nextInt();
        }
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++)
            {
                if(arr[i] + arr[j] == s){
                    int a = Math.min(i,j);
                    int b = Math.max(i,j);
                    System.out.print(a + " " + b);
                }
            }
        }
    }
}
