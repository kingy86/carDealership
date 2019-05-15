import Cars.Model;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Cars.Car car;
    Cars.Model model;
    String colour;
    int price;

    @Before
    public void before(){
        car = new Cars.Car(30000, "red", Model.F150);
    }

    @Test
    public void hasPrice(){
      assertEquals(30000, car.getPrice());
    }

    @Test
    public void hasColour(){
        assertEquals("red", car.getColour());
    }

    @Test
    public void hasModel(){
        assertEquals(Model.F150, car.getModel());
    }

    @Test
    public void hasEngine(){
        assertEquals("Diesel", car.getEngine());
    }

    @Test
    public void hasChasis(){
        assertEquals("Truck", car.getChasis());
    }

    



}
