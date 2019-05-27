package Homework3;

public abstract class Vehicle {
    int speed;
    private String model;

    public Vehicle() {

    }

    public abstract void speedUp(int value);
    public abstract void applyBrake(int value);

    void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public abstract void move();

    final void stop() {
        System.out.println("You are stop");
    }
}
