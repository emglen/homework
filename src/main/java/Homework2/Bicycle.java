package Homework2;

public class Bicycle extends Vehicle {
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

    public void changeGear(int value) {
        gear = value;
    }

    @Override
    public void move() {
        System.out.println("You move on Bicycle with gear: " + gear);
    }

    public void bicycleInfo() {
        System.out.println("Information about your Bicycle:");
        System.out.println("Bicycle ID is: " + id);
        System.out.println("Bicycle gear is: " + gear);
    }
}