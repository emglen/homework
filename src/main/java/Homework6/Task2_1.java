package Homework6;

public class Task2_1{
    public static void main(String[] args) {
        BClass obj=new BClass();
        obj.method();
        obj.method(3);
    }
}
class BClass extends AClass{
    @Override
    public void method(){
        System.out.println("Override void");
    }
    @Override
    public void method(int value){
        System.out.println("Override with value: " + value);
    }
}

abstract class AClass{
    public void method(){
        System.out.println("No override");
    }

    public abstract void method(int value);
}