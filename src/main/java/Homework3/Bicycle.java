package Homework3;

public abstract class Bicycle extends Vehicle {
    public final int id;
    protected int gear;

    public Bicycle() {
        gear = 100;
        id = 1;
    }

    public Bicycle(int id, int gear) {
        this.id = id;
        this.gear = gear;
    }

    public abstract void changeGear(int value);
    @Override
    public void move() {
        System.out.print(" Bicycle with gear: " + gear);
    }

    public void bicycleInfo() {
        System.out.println("Information about your Bicycle:");
        System.out.println("Bicycle ID is: " + id);
        System.out.println("Bicycle gear is: " + gear);
        System.out.println("Your Bicycle speed is: " + speed);
        System.out.println("Model of Bicycle is: " + getModel());
    }
}