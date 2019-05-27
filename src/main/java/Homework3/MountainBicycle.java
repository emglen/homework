package Homework3;

public class MountainBicycle extends Bicycle implements Style, Passanger {
    private int seatHeight;
    private String color;
    private String tuning;
    private String nameOwner;
    private int weigthOwner;
    void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    int getSeatHeight() {
        return seatHeight;
    }
    @Override
    public void paint(String color){
        this.color=color;
        System.out.println("You painted you MountainBicycle in " + color + " color");
    }
    @Override
    public void tuning(String value){
        tuning=value;
        System.out.println("You add to MountainBicycle " + value);
    }

    @Override
    public void setPassangerWeight(int value){
        weigthOwner=value;
    }
    @Override
    public String getOwner(){
        return nameOwner;
    }
    @Override
    public void aboutOwner(){
        System.out.println("Name:" + nameOwner);
        System.out.println("Weight: "+ weigthOwner);
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
