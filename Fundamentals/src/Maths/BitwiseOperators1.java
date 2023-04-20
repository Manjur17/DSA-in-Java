package OperatorsAndForLoop;

public class BitwiseOperators1 {
    public static void main(String[] args) {
        int a = 10, b = 2;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);
        a += ++a - 5/3 + 6*a;
        System.out.println(a);
    }

}