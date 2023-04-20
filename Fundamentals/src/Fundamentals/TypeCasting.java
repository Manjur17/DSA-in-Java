package Fundamentals;
public class TypeCasting {
    public static void main(String[] args) {
        int a=98;
        char ch=(char) (a + 3); //Narrowing or explicit typecasting
        System.out.println(ch);
        System.out.println(4+4);
        System.out.println(4+4.1);
        System.out.println(4.1+4.5);
        System.out.println((double) 2/5);
        System.out.println(2/5);
        double d= 6/4;
        int c =6/4;
        double d1= (d+c);
        System.out.println(d1);
        double a1= 55.5;
        int b1= 55;
        a1 = a1 % 10;
        b1 = b1 % 10;
        System.out.println(a1+ "  "+ b1);
    }
}
