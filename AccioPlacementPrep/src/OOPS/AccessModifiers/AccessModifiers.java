package OOPS.AccessModifiers;

public class AccessModifiers {
    protected int num;
    String name;
    int[] arr;

    public int getNum() { //getters
        return num;
    }

    public void setNum(int num) { //setters
        this.num = num;
    }

    public AccessModifiers(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
