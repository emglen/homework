package Homework4;

public class Task2HappyNumbers {
    private static int s;
    private static int d;
    private static int o;

    public static void setValue(int one, int two, int three){
        s=one;
        d=two;
        o=three;
    }
    public static void setValue(int two, int three){
        d=two;
        o=three;
    }
    public static void setValue(int three){
        o=three;
    }

    public static void setNumber(int value){
        int s=0;
        int d=0;
        int o=0;

        if(value>=100){
            s=value/100;
            d=value/10;
            o=value%10;
            setValue(s,d,o);
        }

        else if(value>=10 && value<11){
                d=value/10;
                o=value%10;
                setValue(d,o);
            }
            else{
                o=value;
                setValue(o);
            }
    }

    public static void main(String[] args) {
        int val=50;

        for (int i=1; i<=val; i++){
        }
    }
}
