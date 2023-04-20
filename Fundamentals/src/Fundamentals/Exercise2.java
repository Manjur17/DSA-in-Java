package Fundamentals;
public class Exercise2{
    public static void main(String[] args) {
        int a=50;
        int b=20;
        if (a < 100)
        {
            if (a>100)
            { System.out.println("Ace");
            }
            if(b<100)
            {
                b=60;
                System.out.println(b);
            }
        }
        else if( a==b )
        {
            System.out.println("King"); //b gets updated to 1
        }
       else {
            System.out.println("Queen");
        }
    }
}
