package Maths;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int max = Math.max(n1,n2);

        while (true){
            if (max % n1 == 0 && max % n2 == 0){
                System.out.println("LCM is " + max);
                break;
            }
            max++;
        }
    }
}
