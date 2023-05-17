package adapter;

public class Disney2MarvelObjectAdapter implements MarvelSuperHeroInterface{
    DisneySuperHeroInterface disneyHero;

    public Disney2MarvelObjectAdapter(DisneySuperHeroInterface disneyHero) {
        this.disneyHero = disneyHero;
    }

    @Override
    public void run() {
        this.disneyHero.moveOnScreen(100);
    }

    @Override
    public void jump() {
        System.out.println(disneyHero.getDescription() + " is jumping");
    }

    @Override
    public void attack(String enemy) {
        this.disneyHero.interact(enemy);
    }

    @Override
    public String getName() {
        return this.disneyHero.getDescription();
    }
}
