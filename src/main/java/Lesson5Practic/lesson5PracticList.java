package Lesson5Practic;

import java.util.*;


public class lesson5PracticList {
    public static void main(String[] args) {
        List<String> demoList=new ArrayList<>();
        demoList.add("Red");
        demoList.add("Green");
        demoList.add("Orange");
        demoList.add("White");
        demoList.add("Black");

        System.out.println(demoList);

        for(String element: demoList){
            System.out.println(element);
        }

        String thirdElement=demoList.get(3);
        System.out.println("Fourth element= " + thirdElement);

        demoList.set(3,"Purpose");
        System.out.println("Fourth element= " + demoList.get(3));

        if(demoList.contains("Green")){
            System.out.println("Green found");
        }
        else {
            System.out.println("Green not found");
        }



        Collections.sort(demoList);
        System.out.println(demoList);

        Collections.shuffle(demoList);
        System.out.println(demoList);
        Collections.shuffle(demoList);
        System.out.println(demoList);

        Collections.reverse(demoList);
        System.out.println(demoList);

        List<String>secondList=new ArrayList<>();
        secondList=demoList.subList(2,4);
        System.out.println(secondList);
        //List<String>secondList=demoList.subList(2,4);
        //        System.out.println(secondList);

        System.out.println(demoList);
        Collections.swap(demoList,0,1);
        System.out.println(demoList);

        demoList.removeAll(demoList);
        System.out.println(demoList);

        System.out.println(demoList.isEmpty());
    }

    public static class Lesson5PracticMap {
        public static void main(String[] args) {
            Map<Integer,String> hashMap=new HashMap<>();
            hashMap.put(1,"Red");
            hashMap.put(2,"White");
            hashMap.put(3,"Black");
            hashMap.put(4,"Yellow");
            hashMap.put(5,"Pink");

            for (Map.Entry x: hashMap.entrySet()){
                System.out.println(x.getKey() + " " + x.getValue());
            }

            Map<Integer,String> hashMap2=new HashMap<>();
            hashMap2.put(6,"Brown");
            hashMap.putAll(hashMap);
            for (Map.Entry x: hashMap2.entrySet()){
                System.out.println(x.getKey() + " "+ x.getValue());
            }

            System.out.println("Is key '1' exists?");
            if(hashMap.containsKey(1)){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }

    public static class lesson5PracticTask {
        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 4, 6, 4, 4, 6, 6));
            System.out.println(list);
            List<Integer> newList= removeDublicates(list);
            System.out.println(newList);
        }

        private static List<Integer> removeDublicates(List<Integer> durtyList){
            List<Integer>bufferList=new ArrayList<>();
            for (Integer element: durtyList){
                if(!bufferList.contains(element)){
                    bufferList.add(element);
                }
            }
            return bufferList;
        }
    }
}
