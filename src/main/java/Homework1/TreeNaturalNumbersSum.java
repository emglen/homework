package Homework1;

public class TreeNaturalNumbersSum {

    public static int numbersSum(int one, int two, int three){
        return one+two+three;
    }

    public static void main(String[] args) {
        int sum=numbersSum(10,3,7);
        System.out.println("Sum of three natural numbers is: " + sum);

        int value1=10;
        int value2=3;
        int value3=7;
        System.out.println("Sum of " + value1 + " and " + value2 +  "and " + value3 + " is: " + numbersSum(value1,value2,value3));
    }
}
