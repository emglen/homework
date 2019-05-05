public class Random {

    public static double getRandValue(){
        double rand=1+Math.random()*1000;
        return Math.round(rand);
    }

    public static void main(String[] args) {
        System.out.println("Random number: " + getRandValue());
    }
}
