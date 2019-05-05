import java.util.Scanner;

public class TwoInputNumbersMultiply {

    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        Scanner inputValue1= new Scanner(System.in);
        int value1= inputValue1.nextInt();

        System.out.println("Enter second  number: ");
        Scanner inputValue2= new Scanner(System.in);
        int value2= inputValue2.nextInt();

        System.out.println("Multiplied two numbers is: " + value1*value2);
    }
}
