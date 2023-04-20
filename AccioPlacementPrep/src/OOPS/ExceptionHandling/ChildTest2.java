package OOPS.ExceptionHandling;

public class ChildTest2 extends ExceptionDemo4{
    //Child class throws an exception with lower in hierarchy
    void msg() throws ArithmeticException {
        System.out.println("child");
    }

    public static void main(String[] args) {
        ExceptionDemo4 p = new ChildTest1();
        try{
            p.msg();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
