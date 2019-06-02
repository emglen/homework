package Homework4;

import java.util.Scanner;

public class Task2AutomorfNumbers {

    public static int typeValue(){
        Scanner inputValue= new Scanner(System.in);
        int value=inputValue.nextInt();
        return value;
    }

    public static void isAutomorf(int number){
        String numberStr=String.valueOf(number);
        int pow= number*number;
        String powStr=String.valueOf(pow);
        String firstElementNumber=Character.toString(numberStr.charAt(0));
        if(powStr.endsWith(firstElementNumber)) {
            System.out.println("Is automorphic ");
        }
        else if(powStr.endsWith(numberStr)){
            System.out.println("Is automorphic ");
        }
         else {
            System.out.println("Is not automorphic ");
        }
    }
    public static void main(String[] args) {
        int value=typeValue();
        isAutomorf(value);
    }
}
