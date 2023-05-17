package flyweight;

public class TestFlyweight {
    public static void main(String[] args) {
        Model3DInterface meteor = Model3DFactory.getModel("meteor");
        meteor.displayOnScreen(new Coordinates(1230,455),"Red");

        Model3DInterface spaceship = Model3DFactory.getModel("spaceship");
        spaceship.displayOnScreen(new Coordinates(2341,734),"Blue");


    }
}
