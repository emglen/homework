package Homework4;

public class Task3Reverse {
    public static String reverseMethod(String value) {
        char[] chs = value.toCharArray();

        int i=0, j=chs.length-1;
        while (i < j) {
            char t = chs[i];
            chs[i] = chs[j];
            chs[j] = t;
            i++; j--;
        }
        return String.valueOf(chs);
    }

    public static void main(String[] args) {
    String str="quick brown fox jumps ";
    String strReverse=new StringBuilder(str).reverse().toString();
    System.out.println(strReverse);

        System.out.println(reverseMethod(str));
    }
}
