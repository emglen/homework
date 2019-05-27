package Homework3;

public class Vehicle {
    int speed = 90;
    private String model = "Alfa";

    public Vehicle() {

    }

    public Vehicle(int speed, String model) {
        this.speed = speed;
        this.model = model;
    }

    void speedUp(int value) {
        System.out.println("You speed up to: " + value + " kmh/h");
        speed = value;
    }

    void applyBrake(int value) {
        System.out.println("You applied brake after: " + value + " kmh/h");
    }

    void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void move() {
        System.out.println("You move on " );
    }

    public void move(int value) {
        System.out.println("I love my vehicle, it is my " + value + " vehicle in life");
    }

    final void stop() {
        System.out.println("You are stop");
    }
}
