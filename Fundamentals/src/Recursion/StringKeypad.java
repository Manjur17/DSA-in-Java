package Recursion;

import java.util.Scanner;

public class StringKeypad {
    public static String[] lastDigit(int n){
        if (n <=0 || n >= 10){
            System.exit(0);
        }
        if (n == 2){
            return new String[]{"a","b","c"};
        }else if (n == 3){
            return new String[]{"d","e","f"};
        }else if (n == 4){
            return new String[]{"g","h","i"};
        }else if (n == 5){
            return new String[]{"j","k","l"};
        }else if (n == 6){
            return new String[]{"m","n","o"};
        }else if (n == 7){
            return new String[]{"p","q","r","s"};
        }else if (n == 8){
            return new String[]{"t","u","v"};
        }else{
            //n == 9
            return new String[]{"w","x","y","z"};
        }
    }
    public static String[] keypad(int n){
       if (n == 0){
           return new String[]{""};
       }
       String[] smallAns = keypad(n/10);
       String[] singleDigitOutput = lastDigit(n%10);
       String[] ans = new String[smallAns.length * singleDigitOutput.length];
       int k = 0;
       for (int i = 0; i < singleDigitOutput.length; i++){
           for (int j = 0; j < smallAns.length; j++){
               ans[k] = smallAns[j] + singleDigitOutput[i];
               k++;
           }
       }
       return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = s.nextInt();
        String[] ans = keypad(n);
        for (String x: ans){
            System.out.print(x + " ");
        }
    }
}
