package OOPS.Inheritance;

public class Car extends Vehicle{
    int noOfDoors;
    //String companyName;
    Car(){
        System.out.println("Car constructor is called");
    }
    public Car(int noOfDoors,String companyName,int noOfTyres){
        //From superclass
        super(companyName,noOfTyres);
        System.out.println("Car's Constructor is called");
//        subclass
        this.noOfDoors = noOfDoors;
    }
    public void print(){
        super.print();
        System.out.println("No of doors are " + noOfDoors);
    }
    public void printCar(){
        super.companyName = "Kia";
        System.out.println(companyName + " " + super.companyName);
    }
}
