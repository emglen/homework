import java.util.Scanner;

public class TwoInputNumbersMultiply {

    public static int typeValue(){
        Scanner inputValue= new Scanner(System.in);
        int value=inputValue.nextInt();
        return value;
    }

    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        int value1=typeValue();
        System.out.println("Enter second  number: ");
        int value2=typeValue();

        System.out.println("Multiplied two numbers is: " + value1*value2);
    }
}
