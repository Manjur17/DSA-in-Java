package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class LineThemUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        String[] sorted = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
            sorted[i] = str[i];
        }
        Arrays.sort(sorted);
        int countIncreasing = 0,countDecreasing = 0;
        for (int i = 0; i < n; i++) {
            if (sorted[i].equals(str[i])){
                countIncreasing++;
            }
             if (sorted[i].equals(str[n-i-1])){
                System.out.println(i);
                countDecreasing++;
            }
        }

        if (countDecreasing == n) {
            System.out.println("DECREASING");
        } else if (countIncreasing == n) {
            System.out.println("INCREASING");
        } else {
            System.out.println("NEITHER");
        }
    }
}
