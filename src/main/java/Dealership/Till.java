package Dealership;

import Behaviours.IMoney;

public class Till implements IMoney {

    private int money;

    public Till(int money){
        this.money = money;
    }

    public int totalMoney(){
        return this.money;
    }

    public void addMoney(int amount){
        this.money += amount;
    }
    public void removeMoney(int amount){
        this.money -= this.money >= amount ? amount : 0;
    }
}
