package Homework3;

public class Singelton {
    private String value;

    private static Singelton ourInstance = new Singelton();

    public static synchronized Singelton getInstance() {
        if (ourInstance == null)
            ourInstance = new Singelton();
        return ourInstance;
    }

    private Singelton() {
    }

    public void setValue(String value){
        this.value=value;
    }
    public String getValue(){
        return value;
    }
}
