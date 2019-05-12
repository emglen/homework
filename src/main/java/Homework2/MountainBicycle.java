package Homework2;

public class MountainBicycle extends Bicycle {
    private int seatHeight;

    void setSeatHeight(int value){
        this.seatHeight=value;
    }
    int getSeatHeight(){
        return seatHeight;
    }
    @Override
    public void bicycleInfo(){
        System.out.println("Information about your Mountain Bicycle:");
        System.out.println("Mountain Bicycle ID is: " + id);
        System.out.println("Mountain Bicycle gear is: " + gear);
        System.out.println("Mountain Bicycle seat heght is: " + seatHeight);
        System.out.println("You Mountain Bicycle speed is: " + speed);
        System.out.println("Model of Mountain Bicycle is: " + getModel());
    }
}
