package Dealership;

import Behaviours.IMoney;
import Cars.Car;

import java.util.ArrayList;

public class Customer implements IMoney {

    private String name;
    private int money;
    ArrayList<Car> cars;

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

    public void addMoney(int amount){
        this.money+= amount;
    }

    public void removeMoney(int amount){
        this.money -= (this.money >= amount) ? amount : 0;
    }

    public int totalMoney(){
        return this.money;
    }

    public void buyCar(){

    }
}
