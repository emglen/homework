package Homework4;

public class Task3lexicographically {
    public static void main(String[] args) {
        String str1="Strings are so cool!";
        String str2="Strings are so cool";
        String str3="Strings ARE so cool!";

        System.out.println("str1 and str 2 : " + str1.equalsIgnoreCase(str2));
        System.out.println("str1 and str 3 : " + str1.equalsIgnoreCase(str3));
    }
}
