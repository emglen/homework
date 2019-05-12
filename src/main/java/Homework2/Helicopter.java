package Homework2;

public class Helicopter extends Vehicle {
    int ampoundOfPassangers;
    int maxHeight;
    int tankSize;

    @Override
    public void move() {
        System.out.println("You move on helicopter with amount of passangers: " + ampoundOfPassangers );
    }
/*
    @Override
    public String toString(){

    }

    @Override
    public int hashCode(){

    }

    @Override
    public String equals(){

    }
 */
}
