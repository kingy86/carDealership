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
        till = new Till(50000);
        customer = new Customer("John Doe", 5000);
        dealership = new Dealership(dealer, till);
        car = new Car(30000, "blue", Model.KUGA);
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

    @Test
    public void canBuyCar(){
        dealership.buyCar(car);
        assertEquals(1, dealership.numberOfCars());
        assertEquals(20000, till.totalMoney());
    }

    @Test
    public void canSellCar(){
        dealership.addCar(car);
        dealership.sellCar(car);
        assertEquals(0, dealership.numberOfCars());
        assertEquals(80000, till.totalMoney());
    }

}
