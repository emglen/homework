package Homework2;

public class Runner {
    public static void main(String[] args) {
        MountainBicycle mountainBicycle = new MountainBicycle();
        mountainBicycle.setSeatHeight(100);
        System.out.println("You set seat height: " + mountainBicycle.getSeatHeight());
        mountainBicycle.changeGear(56);
        mountainBicycle.move();
        mountainBicycle.speedUp(85);
        mountainBicycle.setModel("Mountains");
        mountainBicycle.applyBrake(180);
        mountainBicycle.move(1);

        mountainBicycle.bicycleInfo();

        RoadBicycle roadBicycle = new RoadBicycle();
        roadBicycle.setRudderDepth(78);
        System.out.println("You set rudder depth: " + roadBicycle.getRudderDepth());
        roadBicycle.changeGear(67);
        roadBicycle.move();
        roadBicycle.speed = 60;
        roadBicycle.setModel("Road");
        roadBicycle.applyBrake(160);
        roadBicycle.move(2);

        roadBicycle.bicycleInfo();

        Vehicle vehicle1 = new Vehicle();
        vehicle1.move();
        vehicle1.move(5);
        Vehicle vehicle2 = new Vehicle(70, "Vehicle");
        System.out.println("Vehicle2 model: " + vehicle2.getModel() + " speed is: " + vehicle2.speed);

        Bicycle bicycle1 = new Bicycle();
        Bicycle bicycle2 = new Bicycle(5, 120);
        bicycle1.bicycleInfo();
        bicycle2.bicycleInfo();
        bicycle1.move();
    }
}
