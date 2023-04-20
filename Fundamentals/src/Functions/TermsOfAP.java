package Functions;
import java.util.Scanner;
public class TermsOfAP {
    public static void termsAP(int x1){
        int count=1,i=1;
        while (count <= x1){
            int c= 3*i + 2;
            if (c % 4 != 0){
                System.out.print(c + " ");
                count++;  //Only if number is printed then only count is incremented
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of X:");
        int x=s.nextInt();
        termsAP(x);
    }
}
