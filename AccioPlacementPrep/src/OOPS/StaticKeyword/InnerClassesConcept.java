package OOPS.StaticKeyword;

class Test {
    String name;
    static int age;
    public Test(String name,int age) {
        this.name = name;
        Test.age = age;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class InnerClassesConcept {
    public static void main(String[] args) {
        Test a = new Test("Kunal",22);
        Test b = new Test("Rahul",28);

        System.out.println(a); // return toString()

        System.out.println(a.name);
        System.out.println(Test.age); // static var gets updated
        System.out.println(b.name);
        System.out.println(Test.age);
    }
}
