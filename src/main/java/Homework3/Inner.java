package Homework3;

public class Inner {
    int valueInner1;

    int getValueInner1(){
        return valueInner1;
    }

    public void getInner2Class() {
         class Inner2 {
            public int valueInner2;

            public int getValueInner2() {
                return valueInner2;
            }
        }
        Inner2 inner2 = new Inner2();
        inner2.valueInner2 = 2;
        System.out.println("Inner2 class value is: " + inner2.getValueInner2());
    }

    public static class InnerStatic{
        int valueStatic;

        static void staticMethod(){
            System.out.println("It is a static method");
        }

        int getValueStatic(){
            return valueStatic;
        }
    }

    public static void main(String[] args) {
        Inner inner=new Inner();
        inner.valueInner1=1;
        System.out.println("Inner class value is: " + inner.getValueInner1());
        inner.getInner2Class();

        InnerStatic.staticMethod();
        InnerStatic innerStatic=new InnerStatic();
        innerStatic.valueStatic=3;
        System.out.println("Static class value is: " + innerStatic.getValueStatic());
    }
}
