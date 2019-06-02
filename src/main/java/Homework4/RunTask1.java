package Homework4;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.String.valueOf;

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

    public static void main(String[] args) {
        getToday();
    }
}
