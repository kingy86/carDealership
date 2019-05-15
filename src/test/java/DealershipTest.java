import Cars.Car;
import Cars.Model;
import Dealership.Customer;
import Dealership.Dealership;
import Dealership.Dealer;
import Dealership.Till;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Till till;
    Customer customer;
    Car car;
    Dealer dealer;

    @Before
    public void before(){
        till = new Till(5000);
        customer = new Customer("John Doe");
        dealership = new Dealership(dealer, till);
        car = new Car(30000, "blue", Model.KUGA);
    }

    @Test
    public void amountOfMoneyInTill(){
        assertEquals(5000, dealership.amountOfMoney());
    }

    @Test
    public void hasNoCarsInStock(){
        assertEquals(0, dealership.numberOfCars());
    }

    @Test
    public void canAddCar(){
        dealership.addCar(car);
        assertEquals(1, dealership.numberOfCars());
    }

}
