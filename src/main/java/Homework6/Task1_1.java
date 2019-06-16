package Homework6;

public class Task1_1 {

    public static <T> void changeArray(T[] arr, int index1, int index2){
        T temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    public static <T> void getArrayElements(T[] arr){
        for (T element: arr){
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        Integer []arrInt = new Integer[]{12, 32, 78, 33, 19, 3};
        String []arrString = new String[]{"Value1","Value2","Value3","Value4","Value5"};

        System.out.println("Integer array: ");
        getArrayElements(arrInt);
        System.out.println("String array: ");
        getArrayElements(arrString);

        changeArray(arrInt,2,5);
        changeArray(arrString,2,3);

        System.out.println("\nAfter exchange the positions: ");
        System.out.println("Integer array: ");
        getArrayElements(arrInt);
        System.out.println("String array: ");
        getArrayElements(arrString);
    }
}
