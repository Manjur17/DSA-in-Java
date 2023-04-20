package Assignment;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp = n;
        int revNum = 0;
        while (n > 0){
            int last = n % 10;
            revNum = revNum * 10 + last;
            n /= 10;
        }
        if (temp == revNum){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
