package composite;

public class TestComposite {
    public static void main(String[] args) {
        AbstractCarGroup carGroup = new CarGroup();

        carGroup.addCar(new CarSport());
        carGroup.addCar(new CarSport());

        AbstractCarGroup squad = new CarGroup();
        carGroup.addCar(squad);
        squad.addCar(new CarSport());

        carGroup.move(300);
    }
}
