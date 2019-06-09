package Homework5;

import java.util.*;

public class Task2_4 {
    public static void main(String[] args) {
        List<String> listArray=new ArrayList<>();
        listArray.add("USA");
        listArray.add("Ukraine");
        listArray.add("Argentina");
        listArray.add("Brasil");
        listArray.add("England");

        System.out.println(listArray);

        List<String>  listLinked=new LinkedList<>();
        listLinked.add("Spain");
        listLinked.add("Germany");
        listLinked.add("Italy");
        listLinked.add("Norway");
        listLinked.add("Niederland");

        System.out.println(listLinked);

        System.out.println("After sort:");
        Collections.sort(listArray);
        Collections.sort(listLinked);
        System.out.println(listArray);
        System.out.println(listLinked);

        System.out.println("After first random:");
        Collections.shuffle(listArray);
        Collections.shuffle(listLinked);
        System.out.println(listArray);
        System.out.println(listLinked);

        System.out.println("After second random:");
        Collections.shuffle(listArray);
        Collections.shuffle(listLinked);
        System.out.println(listArray);
        System.out.println(listLinked);
    }
}
