package decorator;

public abstract class ACMEHeroDecorator implements ACMEHeroInterface{
    ACMEHeroInterface objectToDecorate;

    public ACMEHeroDecorator(ACMEHeroInterface objectToDecorate) {
        this.objectToDecorate = objectToDecorate;
    }

    @Override
    public void run() {
        this.objectToDecorate.run();
    }

    @Override
    public void jump() {
        this.objectToDecorate.jump();
    }

    @Override
    public void attack(String enemy) {
        this.objectToDecorate.attack(enemy);
    }

    @Override
    public String getName() {
        return this.objectToDecorate.getName();
    }
}
