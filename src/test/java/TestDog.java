import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDog {
    private Dog dog;

    @Before
    public void setUp(){
        dog = new Dog("Rover");
    }

    @Test
    public void canBark(){
        assertEquals("WOOF WOOF", dog.bark());
    }
}
