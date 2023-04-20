package Functions;
import java.util.Scanner;
public class SumOrProduct {
    public static void sum(int n){
        int sum=0;
        for (int i=1; i <= n; i++){
            sum +=i;
        }
        System.out.println(sum);
    }
    public static void product(int n){
        int product=1;
        for (int i=1; i <= n; i++){
            product *=i;
        }
        System.out.println(product);
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int c=s.nextInt();
        if(c == 1){
            sum(n);
        }
        else if (c == 2){
            product(n);
        }else {
            System.out.println(-1);
        }
    }
}
