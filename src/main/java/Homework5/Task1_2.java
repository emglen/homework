package Homework5;

public class Task1_2 {

    public static class ForStringException extends Exception{
        public ForStringException(String errorText){
            System.out.println(errorText);
        }
    }

    public static void main(String[] args) throws NullPointerException {
        String value="Text";
        try {
            if(value.length()<=5){
                throw new ForStringException("Short string");
            }
        }
        catch (ForStringException e){
            e.getStackTrace();
        }
        finally {
            System.out.println("Finally text");
        }
    }
}
