package Homework5;

import java.util.ArrayList;
import java.util.List;

public class Task2_2 {
    public static void main(String[] args){
        List<Integer> newObject=new ArrayList<>();
        for (int i=0;i<5;i++){
            Mouse mouse=new Mouse(i);
            newObject.add(mouse.hope());
        }
        for (int i: newObject){
            System.out.println("mouseNumber is: " + newObject.get(i));
        }
    }
}
