package Arrays;

import java.util.Scanner;

public class FindUniqueElement {
    public static int findUnique(int[] arr) {
        //Your code goes here
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int peak = -1;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findUnique(arr));
    }
}
