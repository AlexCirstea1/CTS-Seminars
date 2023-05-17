package state;

public class WoundedMovingState implements MovingStateInterface{
    @Override
    public void moveCharacter() {
        System.out.println("Is crawling");
    }
}
