import Homework6.PropertyTask3;
import org.junit.Test;

public class Homework6PropertyTask3Test {
    @Test
    public void getUrl() {
        PropertyTask3 propertyTask3 = new PropertyTask3();
        propertyTask3.getUrl();
        String baseUrl = propertyTask3.property.getProperty("url");
        System.out.println(baseUrl);
    }
}
