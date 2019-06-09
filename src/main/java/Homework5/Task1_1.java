package Homework5;

public class Task1_1 {

    public static void printText(String value){
        if(value==null){
            throw new NullPointerException("Value is null");
        }
        else{
            System.out.println(value);
        }
    }

    public static void main(String[] args) throws NullPointerException {
       String value1=null;
       String value2="Value2 text";
       try{
           printText(value2);
           printText(value1);
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally text");
        }
    }
}
