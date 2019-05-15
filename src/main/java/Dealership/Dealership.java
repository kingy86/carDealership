package Dealership;

import Cars.Car;

import java.util.ArrayList;

public class Dealership {

    ArrayList<Car> cars;
    Till till;
    Dealer dealer;
    ArrayList<Customer> customers;

    public Dealership(Dealer dealer, Till till){
        this.till = till;
        this.dealer = dealer;
        this.cars = new ArrayList<>();
        this.customers = new ArrayList<>();
    }


    public int amountOfMoney() {
        return till.getMoney();
    }

    public int numberOfCars() {
        return cars.size();
    }

    public void addCar(Car car){
        cars.add(car);
    }
}
