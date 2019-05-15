package Dealership;

import Behaviours.ICarTransactions;
import Cars.Car;

import java.util.ArrayList;

public class Dealership implements ICarTransactions {

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

    public int numberOfCars() {
        return cars.size();
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public void removeCar(Car car){
        cars.remove(car);
    }

    public void buyCar(Car car){
        if (till.totalMoney() >= car.getPrice()){
            till.removeMoney(car.getPrice());
            addCar(car);
        }
    }

    public void sellCar(Customer customer, Car car){
        customer.buyCar();
        till.addMoney(car.getPrice());
        removeCar(car);
    }




}
