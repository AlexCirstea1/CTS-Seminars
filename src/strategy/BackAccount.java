package strategy;

public class BackAccount implements PaymentInterface{
    @Override
    public void executePayment(float amount) {
        System.out.println("Bank transaction: " + amount);
    }
}
