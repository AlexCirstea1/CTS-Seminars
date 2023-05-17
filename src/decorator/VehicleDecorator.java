package decorator;

public class VehicleDecorator extends ACMEHeroDecorator{
    String vehicle;

    public VehicleDecorator(ACMEHeroInterface objectToDecorate, String vehicle) {
        super(objectToDecorate);
        this.vehicle = vehicle;
    }

    @Override
    public void run() {
        System.out.println(this.objectToDecorate.getName() + " is in a " + this.vehicle);
    }
}
