package Homework3;

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
    @Override
    public void changeGear(int value){
        gear=value;
        System.out.println("You change in MountainBicycle class gear to: " + value);
    }
    @Override
    public void applyBrake(int value){
        System.out.println("You applied brake on MountainBicycle after: " + value + " kmh/h");
    }
    @Override
    public void speedUp(int value){
        System.out.println("You speed on MountainBicycle up to: " + value + " kmh/h");
    }
}
