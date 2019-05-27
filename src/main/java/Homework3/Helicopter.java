package Homework3;

import java.util.Objects;

public class Helicopter extends Vehicle {
    int ampoundOfPassangers;
    int maxHeight;
    int tankSize;

    public Helicopter(){

    }
    public Helicopter(int ampoundOfPassangers){
        this.ampoundOfPassangers=ampoundOfPassangers;
    }

    @Override
    public void move() {
        System.out.print("helicopter with amount of passangers: " + ampoundOfPassangers);
    }
    @Override
    public void applyBrake(int value){
        System.out.println("You applied brake on helicopter after: " + value + " kmh/h");
    }
    @Override
    public void speedUp(int value){
        System.out.println("You speed on helicopter up to: " + value + " kmh/h");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Helicopter)) return false;
        Helicopter that = (Helicopter) o;
        return ampoundOfPassangers == that.ampoundOfPassangers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ampoundOfPassangers);
    }

    @Override
    public String toString() {
        return "Helicopter{" + "maxHeight=" + maxHeight + '}';
    }
}
