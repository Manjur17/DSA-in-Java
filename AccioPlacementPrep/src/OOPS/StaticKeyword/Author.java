package OOPS.StaticKeyword;

public class Author extends Writer {
//    public static void write() {
//        System.out.println("Writing book");
//    }
    public void display(){
        write();
        System.out.println("Now display inheritance");
    }
}
