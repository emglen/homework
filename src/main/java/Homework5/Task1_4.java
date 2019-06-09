package Homework5;

public class Task1_4 {
    public static void main(String[] args){
        int i=5;
        while (i<=7){
            try{
                System.out.println("i= " + i);
                if(i==6){
                    throw new Exception("Error");
                }
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
            i++;
        }
    }
}
