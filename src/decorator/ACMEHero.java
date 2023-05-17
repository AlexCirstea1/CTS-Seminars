package decorator;

public class ACMEHero implements ACMEHeroInterface{
    String name;
    float damagePoint;

    public ACMEHero(String name, float damagePoint) {
        this.name = name;
        this.damagePoint = damagePoint;
    }

    @Override
    public void run() {
        System.out.println(this.name + " is running");
    }

    @Override
    public void jump() {
        System.out.println(this.name + " is jumping");
    }

    @Override
    public void attack(String enemy) {
        System.out.println(this.name + " attacks " + enemy);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
