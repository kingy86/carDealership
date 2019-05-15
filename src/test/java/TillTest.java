import Dealership.Till;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TillTest {

    Till till;

    @Before
    public void before(){
        till = new Till(5000);
    }

    @Test
    public void hasMoney(){
        assertEquals(5000, till.getMoney());
    }


}
