package OOPS.Interfaces.NestedInterfaces;

public class Demo {
    // nested interface
    public interface NestedInterface {
        //Here interface can be public/private/protected
        // but a non-nested interface is always public
        boolean isOdd(int num);
    }
}

class B implements Demo.NestedInterface {
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
