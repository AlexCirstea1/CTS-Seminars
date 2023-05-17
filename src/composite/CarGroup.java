package composite;

public class CarGroup extends AbstractCarGroup{
    @Override
    public void start() {
        for(Object car: this.group) {
            AbstractCarGroup abstractCarGroup =
                    (AbstractCarGroup) car;
            abstractCarGroup.start();
        }
    }

    @Override
    public void move(int distance) {
        for(Object car: this.group) {
            AbstractCarGroup abstractCarGroup =
                    (AbstractCarGroup) car;
            abstractCarGroup.move(distance);
        }
    }

    @Override
    public void park() {
        for(Object car: this.group) {
            AbstractCarGroup abstractCarGroup =
                    (AbstractCarGroup) car;
            abstractCarGroup.park();
        }
    }
}
