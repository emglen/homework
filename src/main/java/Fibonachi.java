import java.util.Scanner;

public class Fibonachi {

    public static void fibonachi(int fib){
        int result=0;
        int last=0;
        int current=1;

        System.out.print("Fibonachi numbers: "+ current + " ");
        for(int i=1;i<fib;i++){
            result=last+current;
            System.out.print(result + " ");
            last=current;
            current=result;
        }
    }
    public static int typeValue(){
        Scanner inputValue=new Scanner(System.in);
        int value=inputValue.nextInt();
        return value;
    }

    public static void main(String[] args) {
        System.out.println("Enter n: ");
        int n=typeValue();
        fibonachi(n);
    }
}
