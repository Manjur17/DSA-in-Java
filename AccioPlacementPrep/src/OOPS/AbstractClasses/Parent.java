package OOPS.AbstractClasses;

public abstract class Parent {
    int age;
    final int VALUE;

    //static String name; Abstract classes can have static variables also
    //A abstract class cannot be FINAL as it will prevent it from inheritance
    //Multiple abstract classes cannot be inherited

    public Parent(int age) {
        this.age = age;
        VALUE = 32456789;
    }

    static void hello(){
        System.out.println("this is a static method and is allowed inside abstract classes");
    }

    void normal() {
        System.out.println("this is a normal method and is allowed inside abstract classes");
    }

    abstract void career();
    abstract void partner();
}
