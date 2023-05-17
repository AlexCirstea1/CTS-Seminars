package state;

public class TestState {
    public static void main(String[] args) {
        SuperHero superman = new SuperHero("Superman");
        superman.move();
        superman.gotHit(30);
        superman.move();
    }
}
