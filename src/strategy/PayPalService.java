package strategy;

public class PayPalService implements PaymentInterface{
    @Override
    public void executePayment(float amount) {
        System.out.println("Paypal transaction: " + amount);
    }
}
