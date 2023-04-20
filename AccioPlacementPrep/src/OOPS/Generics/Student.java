package OOPS.Generics;

public class Student implements Printable{
     private final int rollNo;
     Student(int roll){
         this.rollNo = roll;
     }
    @Override
    public void print() {
        System.out.println(rollNo);
    }
}
