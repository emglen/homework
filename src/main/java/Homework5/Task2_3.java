package Homework5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task2_3 {

    public static void printMap(Map mp) {
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove();
        }
    }
    public static void main(String[] args) {
        Map<Object, Integer> newObject = new HashMap<Object, Integer>();
        for (int i = 0; i < 5; i++) {
            Mouse mouse = new Mouse(i);
            newObject.put(mouse, mouse.hope());
        }
    printMap(newObject);
    }
}
