package Homework6;

public class Task1_3 {

    public static class SuperClass<T extends B>{
        private T object;

        public SuperClass(T object) {
            this.object=object;
        }
        public void getMethodClass() {
            object.method();
        }

        public static void main(String[] args) {
            SuperClass<B> objB=new SuperClass<B>(new B());
            objB.getMethodClass();

            SuperClass<A> objA=new SuperClass<A>(new A());
            objA.getMethodClass();
        }
    }
    public static class A extends B{
        @Override
        public void method() {
        super.method();
        System.out.println("With class A");
        }
    }
    static class B{
        public void method(){
            System.out.println("Method class B");
        }
    }
}
