package Arrays2D;

import java.util.Scanner;

public class XOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (x % i == 0){
                int b = x/i;
                if (b <= n) count++;
            }
        }
        System.out.println(count);
    }
}
