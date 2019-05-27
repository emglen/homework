package Homework3;

public class Car extends Vehicle {
    static String carType;
    static String transmission = "automat";

    static public void aboutCar(){
        System.out.println("Car type: " + carType);
        System.out.println("Transmission: " + transmission);
    }
    @Override
    public void move(){
        System.out.println("You move on car");
    }
    @Override
    public void applyBrake(int value){
        System.out.println("You applied brake on car after: " + value + " kmh/h");
    }
    @Override
    public void speedUp(int value){
        System.out.println("You speed on car up to: " + value + " kmh/h");
    }

}
