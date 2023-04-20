package OOPS.AccessModifiers;

public class Main {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers(10, "Kunal");
        // need to do a few things
        // 1. access the data members
        // 2. modify the data members

//        ArrayList<Integer> list = new ArrayList<>(23);
//        list.DEFAULT_CAPACITY; -> not able to access as it is private

        System.out.println(obj.getNum());
        int n = obj.num; //allowed in same package
    }
}
