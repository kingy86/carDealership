import Cars.Car;
import Cars.Model;
import Dealership.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Car car;

    @Before
    public void before(){
        customer = new Customer("John Doe", 0);
        car = new Car(4500, "yellow", Model.FOCUS);
    }

    @Test
    public void hasNoCars(){
        assertEquals(0, customer.carCount());
    }

    @Test
    public void canAddCar(){
        customer.addCar(car);
        assertEquals(1, customer.carCount());
    }

    @Test
    public void hasNoMoney(){
        assertEquals(0, customer.totalMoney());
    }

    @Test
    public void canAddMoney(){
        customer.addMoney(10);
        assertEquals(10, customer.totalMoney());
    }

    @Test
    public void canRemoveMoney(){
        customer.addMoney(30);
        customer.removeMoney(10);
        assertEquals(20, customer.totalMoney());
    }

    @Test
    public void canRemoveMoneyOnlyIfSuffucientFunds(){
        customer.removeMoney(10);
        assertEquals(0, customer.totalMoney());
    }
}
