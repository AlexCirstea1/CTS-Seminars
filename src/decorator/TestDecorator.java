package decorator;

public class TestDecorator {
    public static void main(String[] args) {
        ACMEHeroInterface darthVader = new ACMEHero("Darth Vader", 1000);
        darthVader.attack("Obi-Wan Kenobi");
        darthVader.run();

        darthVader = new WeaponDecorator(darthVader,"lightsaber");
        darthVader.attack("Obi-Wan Kenobi");
        darthVader.run();

        darthVader = new VehicleDecorator(darthVader, "TIE-Fighter");
        darthVader.attack("Obi-Wan Kenobi");
        darthVader.run();
    }
}
