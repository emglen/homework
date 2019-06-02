package Homework4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RunTask1 {
    public static void getToday(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("F");
        int data= Integer.parseInt(dateFormat.format(new Date()));
        switch (data) {
            case 1:
                System.out.println("Today is: " + Day.Sunday);
                break;
            case 2:
                System.out.println("Today is: " + Day.Monday);
                break;
            case 3:
                System.out.println("Today is: " + Day.Tuesday);
                break;
            case 4:
                System.out.println("Today is: " + Day.Wednesday);
                break;
            case 5:
                System.out.println("Today is: " + Day.Thursday);
                break;
            case 6:
                System.out.println("Today is: " + Day.Friday);
                break;
            case 7:
                System.out.println("Today is: " + Day.Saturday);
                break;
        }
    }

    public static int randomValue() {
        int pick = new Random().nextInt(Val30.values().length);
        return Val30.values()[pick].ordinal();
    }
    public static void main(String[] args) {
        getToday();
        System.out.println("Random value is: " + randomValue());
    }
}
