package Homework1;

public class Factorial {

    public static int getFactorial(int value){
        int factorial=1;
        if(value==0){
            return 1;
        }
        else {
            for (int i=1;i<=value;i++) {
              factorial=factorial*i;
            }
            return  factorial;
        }
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Homework1.Factorial of " + number + " is: " + getFactorial(number));
    }
}
