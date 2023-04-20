package Assignment;

import java.util.Scanner;

public class ArrayRotation {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int q = s.nextInt();
        int[] arr = new int[n]; //creating the array
        int[] rotatedArray = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            rotatedArray[newIndex] = arr[i];
        }
        for (int i = 0; i < q; i++) {
            int idx = s.nextInt();
            System.out.println(rotatedArray[idx]);
        }
    }
}
