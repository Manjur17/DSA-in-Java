package Fundamentals;
public class IfConditionals {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        if ((b=1)==a)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(b+1); //b gets updated to 1
        }
        System.out.println(a);
    }
}
