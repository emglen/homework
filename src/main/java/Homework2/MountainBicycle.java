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
    }
}
