package OOPS.StaticKeyword;

public class InnerClasses {
    //if we want to use test class as non-static put it outside InnerClasses
    //As inner classes need to be static i.e now it is not dependent of the object of the above class -> InnerClasses
    //inner class is dependent only on the outer class but not dependent its objects
    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");

        System.out.println(a);

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
