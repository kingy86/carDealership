package Dealership;

import Behaviours.ICarTransactions;
import Behaviours.IMoney;
import Cars.Car;


import java.util.ArrayList;

public class Customer implements IMoney, ICarTransactions {

    private String name;
    private int money;
    ArrayList<Car> cars;
 ;

    public Customer(String name, int money){
        this.name = name;
        this.money = money;
        this.cars = new ArrayList<>();
    }

    public int carCount(){
        return cars.size();
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public void removeCar(Car car){
        cars.remove(car);
    }

    public void addMoney(int amount){
        this.money+= amount;
    }

    public void removeMoney(int amount){
        this.money -= (this.money >= amount) ? amount : 0;
    }

    public int totalMoney(){
        return this.money;
    }

    public void buyCar(Car car){
        if (totalMoney() >= car.getPrice()){
            removeMoney(car.getPrice());
            addCar(car);
        }
    }

    public void sellCar(Car car){
        addMoney(car.getPrice());
        removeCar(car);
    }
}
