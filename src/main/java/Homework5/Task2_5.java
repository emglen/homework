package Homework5;

import java.util.*;

public class Task2_5 {
    public static void main(String[] args){
        Map<String,Integer> map=new HashMap<>();
        map.put("val1",135);
        map.put("val3",67);
        map.put("val5",89);
        map.put("val4",698);
        map.put("val2",650);
        System.out.println("Map: " + map);

        Map <String,Integer> sortedMap1=new TreeMap<>(map);
        System.out.println("Tree map: " + sortedMap1);

        Map<String,Integer> linkedMap=new LinkedHashMap<>(sortedMap1);
        System.out.println("Sorted map: " + linkedMap);

        linkedMap.put("val6",87);
        map.putAll(linkedMap);
        System.out.println(map);

        Set <String> setHash=new HashSet<>();
        setHash.add("USA");
        setHash.add("Ukraine");
        setHash.add("Argentina");
        setHash.add("Brasil");
        setHash.add("England");

        System.out.println("Hash set: "+ setHash);
        List<String> list=new ArrayList<>(setHash);

        Collections.sort(list);

        Set<String> linkedHashSet=new LinkedHashSet<>(list);
        System.out.println("Sorted linked hash set: " + linkedHashSet);
    }
}

