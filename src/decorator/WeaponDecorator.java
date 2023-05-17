package decorator;

public class WeaponDecorator extends ACMEHeroDecorator{
    String weapon;
    public WeaponDecorator(ACMEHeroInterface objectToDecorate, String weapon) {
        super(objectToDecorate);
        this.weapon = weapon;
    }

    @Override
    public void attack(String enemy) {
        super.attack(enemy);
        System.out.println(this.getName() + " is using a " + this.weapon);
    }
}
