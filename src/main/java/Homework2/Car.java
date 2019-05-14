package Homework2;

public class Car extends Vehicle {
    static String carType;
    static String transmission = "automat";

    static public void aboutCar(){
        System.out.println("Car type: " + carType);
        System.out.println("Transmission: " + transmission);
    }
}
