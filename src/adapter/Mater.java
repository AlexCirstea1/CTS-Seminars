package adapter;

public class Mater implements DisneySuperHeroInterface{
    float lifePoints;

    public Mater(float healthpoints) {
        this.lifePoints = healthpoints;
    }

    @Override
    public float getLifepoints() {
        return this.lifePoints;
    }

    @Override
    public String getDescription() {
        return "This is Mater from Radiator Springs!";
    }

    @Override
    public void moveOnScreen(float distance) {
        System.out.println("Mater is moving");
    }

    @Override
    public void interact(String anotherCharacter) {
        System.out.println("Mater is interacting with " + anotherCharacter);
    }
}
