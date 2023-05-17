package composite;

import java.util.ArrayList;


public abstract class CarGroupInterface {
    ArrayList<Object> group = new ArrayList<>();
    public abstract void addCar(Object object);
    public abstract void removeCar(Object object);
    public abstract Object getCar(Object object);
}
