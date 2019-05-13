package Homework2;

public class MountainBicycle extends Bicycle {
    private int seatHeight;

    void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    int getSeatHeight() {
        return seatHeight;
    }

    @Override
    public void bicycleInfo() {
        super.bicycleInfo();
        System.out.println("Mountain Bicycle seat height is: " + seatHeight);
        System.out.println("You Mountain Bicycle speed is: " + speed);
        System.out.println("Model of Mountain Bicycle is: " + getModel());
    }
}
