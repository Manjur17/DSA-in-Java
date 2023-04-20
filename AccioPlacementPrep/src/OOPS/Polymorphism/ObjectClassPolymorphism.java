package OOPS.Polymorphism;

public class ObjectClassPolymorphism {
    int num;

    public ObjectClassPolymorphism(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        //At run time this toString() is getting overridden
        //as all classes extends the object class in JAVA
        //we can say here polymorphism or method is getting overridden
        // as toString of object class(super class) is getting overridden
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectClassPolymorphism obj = new ObjectClassPolymorphism(54);

        System.out.println(obj);
    }
}
