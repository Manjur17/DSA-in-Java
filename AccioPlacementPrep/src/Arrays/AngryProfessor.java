package Arrays;

import java.util.Scanner;

public class AngryProfessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] <= 0 && k > 0) {
                    k--;
                }
            }
            if (k == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            t--;
        }
    }
}
