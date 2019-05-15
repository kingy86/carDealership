package Cars;

import java.util.ArrayList;

public class Car {

    int price;
    String colour;
    Model model;

    public Car(int price, String colour, Model model){
        this.price = price;
        this.colour = colour;
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public Model getModel() {
        return model;
    }

    public String getEngine() {
        return model.getEngine();
    }

    public String getChasis() {
        return model.getChasis();
    }


}
