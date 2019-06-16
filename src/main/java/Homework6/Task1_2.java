package Homework6;

import java.util.Arrays;

public class Task1_2 {

    public static <T> void getMaxValue(T[] array){
        T max;
        try{
            Arrays.sort(array);
            max = array[array.length - 1];
            System.out.println(max);
        }
        catch (Exception e){
            e.getStackTrace();
        }
    }

    public static void main(String[] args) {
        Integer []arrInt = new Integer[]{12, 32, 78, 33, 19, 3};
        String []arrString = new String[]{"Value1","Value2","Value3","Value4","Value5"};
        getMaxValue(arrInt);
        getMaxValue(arrString);
    }
}
