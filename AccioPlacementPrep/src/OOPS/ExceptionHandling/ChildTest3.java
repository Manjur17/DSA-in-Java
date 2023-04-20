package OOPS.ExceptionHandling;

public class ChildTest3 extends ExceptionDemo4{
    //Child class doesn't throw an exception
    void msg()  {
        System.out.println("child");
    }

    public static void main(String[] args) {
        ExceptionDemo4 p = new ChildTest1();
        try{
            p.msg();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
