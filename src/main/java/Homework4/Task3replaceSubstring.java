package Homework4;

public class Task3replaceSubstring {
    public static void main(String[] args) {
    String str="The quick brown fox jumps over the lazy dog";
    String replaceCat=str.replace("dog","cat");
    String replaceFox=str.replace("dog","other fox");

    System.out.println(str);
    System.out.println(replaceCat);
    System.out.println(replaceFox);
    }
}
