package Homework5;

import java.util.ArrayList;
import java.util.List;

public class Task2_1 {

    public static double getRandValue(){
        double rand=1+Math.random()*1000;
        return Math.round(rand);
    }

    public static void main(String[] args){
        List<Double> doubleList=new ArrayList<>();
        for (int i=0;i<=10;i++){
            doubleList.add(getRandValue());
        }
        System.out.println(doubleList);
    }
}
