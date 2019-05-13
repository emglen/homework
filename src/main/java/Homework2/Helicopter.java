package Homework2;

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
        System.out.println("You move on helicopter with amount of passangers: " + ampoundOfPassangers);
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
