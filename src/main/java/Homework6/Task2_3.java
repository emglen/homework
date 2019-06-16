package Homework6;

public class Task2_3 {
    @NewAnnotation(
            name="Name1",
            position = "Manager",
            organization = "IT"
    )
    public static void testMethod(){
        System.out.println("New annotation");
    }

    public static void main(String[] args) {
        testMethod();
    }
}
