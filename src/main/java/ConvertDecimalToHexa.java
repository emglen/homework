import java.util.Scanner;

public class ConvertDecimalToHexa {

    public static int typeValue(){
        Scanner inputValue=new Scanner(System.in);
        int value=inputValue.nextInt();
        return value;
    }

    public static void main(String[] args) {
        System.out.println("Enter a decimal number: ");
        int decimal=typeValue();

        System.out.println("Decimal to hexadecimal: " + Integer.toHexString(decimal));
    }
}
