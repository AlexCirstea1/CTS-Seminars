package composite;

public class CarSport extends AbstractCarGroup{
    @Override
    public void start() {
        System.out.println("Sport car engine is starting...");
    }

    @Override
    public void move(int distance) {
        System.out.println("Sport car is moving " + distance + " meters");
    }

    @Override
    public void park() {
        System.out.println("Sport car is parked");
    }

    @Override
    public void addCar(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeCar(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object getCar(Object object) {
        throw new UnsupportedOperationException();
    }
}
