package Homework2;

public class RoadBicycle extends Bicycle {
    private int rudderDepth;

    void setRudderDepth(int value){
        this.rudderDepth=value;
    }

    int getRudderDepth(){
        return rudderDepth;
    }
    @Override
    public void bicycleInfo(){
        System.out.println("Information about your Road Bicycle:");
        System.out.println("Road Bicycle ID is: " + id);
        System.out.println("Road Bicycle gear is: " + gear);
        System.out.println("Road Bicycle rudder depth is: " + rudderDepth);
        System.out.println("You Road Bicycle speed is: " + speed);
        System.out.println("Model of Road Bicycle is: " + getModel());
    }
}
