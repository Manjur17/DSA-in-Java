package Strings;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int h1 = (int) str.charAt(0) - '0';
        int h2 = (int) str.charAt(1) - '0';
        int hh = (h1 * 10 + h2);
        if (str.charAt(8) == 'A') {
            if (hh == 12) {
                //for 12 AM Case
                System.out.print("00");
                for (int i = 2; i <= 7; i++) {
                    //print rest of the character
                    System.out.print(str.charAt(i));
                }
            } else {
                for (int i = 0; i <= 7; i++) {
                    //print the string
                    System.out.print(str.charAt(i));
                }
            }
        } else {
            //for PM case
            if (hh == 12) {
                System.out.print("12");
                for (int i = 2; i <= 7; i++) {
                    //print rest of the character
                    System.out.print(str.charAt(i));
                }
            } else {
                System.out.print(hh + 12);
                for (int i = 2; i <= 7; i++) {
                    //print rest of the character
                    System.out.print(str.charAt(i));
                }
            }
        }
        System.out.println();
        method2(str);
    }
    public static void method2(String str){
        String hr  = str.substring(0,2);
        String mm  = str.substring(3,5);
        String sec  = str.substring(6,8);
        if (str.charAt(8) == 'A') {
            if (hr.equals("12")){
                hr = "00";
            }
            String military = "";
            military += hr + ":" + mm + ":" + sec;
            System.out.println(military);
        }else {
            if (!hr.equals("12")){
               int h = Integer.parseInt(hr);
               h += 12;
               hr = Integer.toString(h);
            }
            String military = "";
            military += hr + ":" + mm + ":" + sec;
            System.out.println(military);
        }

    }
}
