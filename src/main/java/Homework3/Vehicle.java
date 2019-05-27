package Homework3;

public abstract class Vehicle {
    int speed;
    private String model;

    public Vehicle() {

    }

    public abstract void speedUp(int value);
      //  System.out.println("You speed up to: " + value + " kmh/h");


    public abstract void applyBrake(int value);

      //  System.out.println("You applied brake after: " + value + " kmh/h");

    void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
     //   System.out.println("You move on " );

    public abstract void move();

    final void stop() {
        System.out.println("You are stop");
    }
}
