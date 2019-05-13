package Homework2;

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
        System.out.println("You Road Bicycle speed is: " + speed);
        System.out.println("Model of Road Bicycle is: " + getModel());
    }
}
