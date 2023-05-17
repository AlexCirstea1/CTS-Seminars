package adapter;

import java.util.ArrayList;

public class TestAdapter {
    public static void main(String[] args) {
        ArrayList<MarvelSuperHeroInterface> heroes = new ArrayList<>();

        heroes.add(new MarvelSuperHero("Ironman",1000));
        heroes.add(new MarvelSuperHero("Thor",45000));

        for (MarvelSuperHeroInterface hero :
                heroes) {
            hero.attack("Thanos");
        }

        DisneySuperHeroInterface mater = new Mater(100);
        Disney2MarvelObjectAdapter materAdapter = new Disney2MarvelObjectAdapter(mater);
        heroes.add(materAdapter);
        for (MarvelSuperHeroInterface hero :
                heroes) {
            hero.attack("Thanos");
        }
    }
}
