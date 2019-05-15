package Dealership;

import Cars.Car;

import java.util.ArrayList;

public class Dealership {

    ArrayList<Car> car;
    int till;
    Customer customer;

    public Dealership.Customer getCustomer() {
        return customer;
    }

    public int getTill() {
        return till;
    }

    public ArrayList<Cars.Car> carsInStock() {
        return car.size();
    }
}
