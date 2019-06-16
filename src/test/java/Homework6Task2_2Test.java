import Homework6.Task2_2;
import org.junit.Test;
import static org.junit.Assert.*;

public class Homework6Task2_2Test {
    Task2_2 object=new Task2_2();

    @Test
    public void zeroValue(){
        assertEquals(0,object.method1());
    }
    @Test(expected = AssertionError.class)
    public void zeroValueWithNotZero(){
        assertEquals(1,object.method1());
    }
}
