package Homework3;

import static java.lang.System.*;

public interface Control {
    void increaseSpeed(int newSpeed);
    void reduceSpeed(int newSpeed);
    void stay();

    default void turnLeft(){
        System.out.println("You turned on left");
    }
    default void turnRight(){
        System.out.println("You turned on right");
    }
}
