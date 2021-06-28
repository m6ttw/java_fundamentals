import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCat {
    private Cat cat;

    @Before
    public void setUp() {
        cat = new Cat("Felix");
    }

    @Test
    public void hasName(){
        assertEquals("Felix", cat.getName());
    }
}
