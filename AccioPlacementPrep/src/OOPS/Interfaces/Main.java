package OOPS.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Engine car = new Car();
//       car.a -> ERROR
//        car.acc();
//        car.start();
//        car.stop();
//
//        Media carMedia = new Car();
//        carMedia.stop();


        NiceCar cars = new NiceCar();
        cars.start();
        cars.startMusic();
        cars.upgradeEngine();
        cars.start();

        Engine electric = new ElectricEngine();
        NiceCar car = new NiceCar(electric); //passing in the constructor
        car.start();
        car.stop();
    }
}
