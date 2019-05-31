package Homework3;

public class Anonymous {
    public static void main(String[] args) {
        NotAnonyomus notAnonyomus=new NotAnonyomus(){
          @Override
            public void method1(){
              System.out.println("method1 from Anonyomus class");
          }
        };

        notAnonyomus.method1();
        notAnonyomus.method2();
    }
}

class NotAnonyomus{
    public void method1(){
        System.out.println("method1 from NotAnonyomus class");
    }
    public void method2(){
        System.out.println("method2 from NotAnonyomus class");
    }
}
