package OOPS.ExceptionHandling;

public class ChildTest1 extends ExceptionDemo4 {
    //Child class throws same exception as parent class
    void msg() throws Exception {
        System.out.println("child");
    }

    public static void main(String[] args) {
        ExceptionDemo4 p = new ChildTest1();
        try{
            p.msg();
        }catch(Exception e){
            System.out.println(e);
        }
//        p.msg();
    }
}
