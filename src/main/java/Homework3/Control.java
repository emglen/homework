package Homework3;

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
    static void focus(){
        System.out.println("You doing good focus on your Bicycle");
    }
}
