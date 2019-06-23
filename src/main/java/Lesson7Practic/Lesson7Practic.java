package Lesson7Practic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lesson7Practic {

    public static void main(String[] args) {
        Stream<Integer> stream=Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(p-> System.out.println(p));

        Stream<Integer> stream2=Stream.of(1,2,3,4,5,6,7,8,9);
        stream2.forEach(p-> System.out.println(p));

        List<Integer> list= new ArrayList<>();
        for (int i=1;i<10;i++){
            list.add(i);
        }
        list.stream().forEach(p-> System.out.println(p));

        Stream<Date> dateStream=Stream.generate(()-> new Date());
        dateStream.limit(10).forEach(p-> System.out.println(p));

        IntStream intStream="12345_abcdefg".chars();
        intStream.forEach(p-> System.out.println(p));

        Stream<String> stream3=Stream.of("A$B$C".split("\\$"));
        stream3.forEach(p-> System.out.println(p));

        List<Integer> list2= new ArrayList<>();
        for (int i=1;i<10;i++){
            list2.add(i);
        }
        List<Integer> evenNumberList=list2.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(evenNumberList);

        List<Integer> list3= new ArrayList<>();
        for (int i=1;i<10;i++){
            list2.add(i);
        }
        List<Integer> evenNumberArr=list2.stream().filter(i->i%2==0).toArray(Integer[]::new);
        System.out.println(evenNumberArr);

        List<String> memberNames=new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        memberNames.stream().filter((s)->s.startsWith("A")).forEach(System.out::println);
        memberNames.stream().filter((s)->s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
        memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

        long totalMatched=memberNames.stream().filter((s)->s.startsWith("A")).count();
        System.out.println(totalMatched);

        List<Integer> memberNames1=new ArrayList<>();
        for (int i=1;i<10;i++){
            memberNames1.add(i);
        }

        Integer[] eventNumbersArr=memberNames1.stream().filter(i->i%2==0).toArray(Integer[]::new);

        memberNames1.parallelStream().filter(i->i%2==0).forEach(System.out::println);

    }
}
