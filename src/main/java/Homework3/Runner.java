package Homework3;

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
        mountainBicycle.move();

        mountainBicycle.increaseSpeed(120);
        mountainBicycle.reduceSpeed(60);
        mountainBicycle.turnLeft();
        mountainBicycle.turnRight();
        mountainBicycle.paint("White");
        mountainBicycle.tuning("Not tuning");
        mountainBicycle.stay();
        System.out.println("Bicycle have " + mountainBicycle.numberWheels + " wheels");
        Control.focus();

        mountainBicycle.bicycleInfo();

        RoadBicycle roadBicycle = new RoadBicycle();
        roadBicycle.setRudderDepth(78);
        System.out.println("You set rudder depth: " + roadBicycle.getRudderDepth());
        roadBicycle.changeGear(67);
        roadBicycle.move();
        roadBicycle.speed = 60;
        roadBicycle.setModel("Road");
        roadBicycle.applyBrake(160);
        roadBicycle.move();

        roadBicycle.increaseSpeed(150);
        roadBicycle.reduceSpeed(80);
        roadBicycle.turnLeft();
        roadBicycle.turnRight();
        roadBicycle.paint("Green");
        roadBicycle.tuning("Ksenon");
        roadBicycle.stay();
        System.out.println("Bicycle have " + roadBicycle.numberWheels + " wheels");
        Control.focus();

        roadBicycle.bicycleInfo();

    }
}
