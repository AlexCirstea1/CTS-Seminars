package state;

public class NormalMovingState implements MovingStateInterface{
    @Override
    public void moveCharacter() {
        System.out.println("Is running");
    }
}
