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

        Helicopter helicopter1=new Helicopter(100);
        Helicopter helicopter2=new Helicopter(100);
        Helicopter helicopter3=new Helicopter(120);
        System.out.println("Helicopter1 == Helicopter2: " + helicopter1.equals(helicopter2));
        System.out.println("Helicopter1 == Helicopter3: " + helicopter1.equals(helicopter3));
        System.out.print("Helicopter1 == Helicopter2 with == : ");
        System.out.println(helicopter1==helicopter2);

        RoadBicycle roadBicycle1=new RoadBicycle();
        roadBicycle1.setRudderDepth(56);
        RoadBicycle roadBicycle2=new RoadBicycle();
        roadBicycle2.setRudderDepth(56);
        System.out.println("RoadBicycle == RoadBicycle1: " + roadBicycle.equals(roadBicycle1));
        System.out.println("RoadBicycle1 == RoadBicycle2: " + roadBicycle1.equals(roadBicycle2));
        System.out.print("RoadBicycle1 == RoadBicycle with2 == : ");
        System.out.println(roadBicycle1==roadBicycle2);

        Car.carType="Sedan";
        System.out.println("Your car is "+ Car.carType + " with " + Car.transmission + " transmission");
        Car.aboutCar();
    }
}
