package Arrays;

import java.util.Scanner;

public class EqualityInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count =0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < n-1; j++) {
                if (arr[i] == arr[j]){
                    count++;
                }
            }
        }
        System.out.println(n-count);
    }
}
