package OOPS.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        son.normal();

        Parent daughter = new Daughter(28);
        daughter.partner();

        Parent.hello();
//        Parent mom = new Parent(45); -> ERROR as objects of abstract classes cannot be formed
    }
}
