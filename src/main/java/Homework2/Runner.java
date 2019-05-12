package Homework2;

public class Runner {
    public static void main(String[] args) {
        MountainBicycle mountainBicycle=new MountainBicycle();
        mountainBicycle.setSeatHeight(100);
        System.out.println("You set seat height: " + mountainBicycle.getSeatHeight());
        mountainBicycle.changeGear(56);
        mountainBicycle.move();
        mountainBicycle.speedUp(85);
        mountainBicycle.setModel("Mountains");
        mountainBicycle.applyBrake(180);

        mountainBicycle.bicycleInfo();

        RoadBicycle roadBicycle=new RoadBicycle();
        roadBicycle.setRudderDepth(78);
        System.out.println("You set rudder depth: " + roadBicycle.getRudderDepth());
        roadBicycle.changeGear(67);
        roadBicycle.move();
        roadBicycle.speed=60;
        roadBicycle.setModel("Road");
        roadBicycle.applyBrake(160);

        roadBicycle.bicycleInfo();

    }
}
