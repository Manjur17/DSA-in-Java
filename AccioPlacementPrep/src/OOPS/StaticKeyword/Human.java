package OOPS.StaticKeyword;

public class Human {
    static long population;
    int age;
    String name;
    int salary;
    boolean married;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }

    public Human() {

    }

    static void message() {
        System.out.println("Hello world");
        /* System.out.println(this.age);  can't use this over here as this belongs to object and static belongs to the class */
    }
    String message = "Hello World";

    public static void display(Human human){
        System.out.println(human.message);
    }

    public static void main(String[] args) {
        Human kunal = new Human();
        kunal.message = "Kunal's message";
        Human.display(kunal);
    }
}

