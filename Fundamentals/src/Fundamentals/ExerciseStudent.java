package Fundamentals;
import java.util.Scanner;
public class ExerciseStudent {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char c=s.next().charAt(0); //reading character
        int marks1=s.nextInt();
        int marks2=s.nextInt();
        int marks3=s.nextInt();
        System.out.println("The Student name is: "+ c +"\n"+ "The marks secured are: "+ marks1 +" "+ marks2+" "+ marks3);
        int avg=(marks1+marks2+marks3)/3;
        System.out.println("The Average is: "+ avg);
    }
}
