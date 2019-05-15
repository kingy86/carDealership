import Cars.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine("Hybrid");
    }

    @Test
    public void hasType(){
        assertEquals("Hybrid", engine.getType());
    }
}
