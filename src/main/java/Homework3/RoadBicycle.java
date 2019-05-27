package Homework3;

import java.util.Objects;

public class RoadBicycle extends Bicycle {
    private int rudderDepth;

    void setRudderDepth(int rudderDepth) {
        this.rudderDepth = rudderDepth;
    }

    int getRudderDepth() {
        return rudderDepth;
    }

    @Override
    public void bicycleInfo() {
        super.bicycleInfo();
        System.out.println("Road Bicycle rudder depth is: " + rudderDepth);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoadBicycle)) return false;
        RoadBicycle that = (RoadBicycle) o;
        return rudderDepth == that.rudderDepth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rudderDepth);
    }
    @Override
    public void changeGear(int value){
        gear=value;
        System.out.println("You change in RoadBicycle class gear to: " + value);
    }
    @Override
    public void applyBrake(int value){
        System.out.println("You applied brake on RoadBicycle after: " + value + " kmh/h");
    }
    @Override
    public void speedUp(int value){
        System.out.println("You speed on RoadBicycle up to: " + value + " kmh/h");
    }
}
