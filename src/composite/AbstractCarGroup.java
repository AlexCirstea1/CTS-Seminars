package composite;

public abstract class AbstractCarGroup extends CarGroupInterface implements CarActions {
    @Override
    public void addCar(Object object) {
        if(object instanceof AbstractCarGroup) {
            this.group.add(object);
        }
        else {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public void removeCar(Object object) {
        this.group.remove(object);
    }

    @Override
    public Object getCar(Object object) {
        return this.group.get(this.group.indexOf(object));
    }
}
