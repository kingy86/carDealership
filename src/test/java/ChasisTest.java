import Cars.Chasis;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChasisTest {

    Chasis chasis;

    @Before
    public void before(){
        chasis = new Chasis("SUV");
    }

    @Test
    public void hasType(){
        assertEquals("SUV", chasis.getType());
    }
}
