package Homework6;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyTask3 {
    public Properties property=new Properties();

    public  void getUrl(){
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("\\Homework6.properties");
            property.load(inputStream);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
