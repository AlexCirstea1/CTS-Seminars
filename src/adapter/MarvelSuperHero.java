package adapter;

public class MarvelSuperHero implements MarvelSuperHeroInterface{
    String name;
    float damagePoints;

    public MarvelSuperHero(String name, float damagePoints) {
        this.name = name;
        this.damagePoints = damagePoints;
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
