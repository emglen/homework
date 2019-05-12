package Homework2;

public class Vehicle {
    int speed=90;
    private String model="Alfa";

    void speedUp(int value){
        System.out.println("You speed up to: " + value + " kmh/h");
    }
    void applyBrake(int value){
        System.out.println("You applied brake after: " + value + " kmh/h");
    }
    void setModel(String model){
        this.model=model;
    }
    public void move(){
        System.out.println("You move on: " + model);
    }
    final  void stop(){
        System.out.println("You are stop");
    }
}
