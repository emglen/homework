package Homework3;

public interface Style {
    final int numberWheels=2;

    void paint(String color);
    void tuning(String value);

    static void standartColor(){
        System.out.println("You changed color your car");
    }
}
