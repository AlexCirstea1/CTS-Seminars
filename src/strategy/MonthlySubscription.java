package strategy;

public class MonthlySubscription {
    float amount;
    String username;
    PaymentInterface paymentMethod = null;

    public MonthlySubscription(float amount, String username) {
        this.amount = amount;
        this.username = username;
    }

    public void pay(){
        if(paymentMethod != null) {
            paymentMethod.executePayment(this.amount);
        }
        else {
            throw new UnsupportedOperationException();
        }
    }

    public void setPaymentMethod(PaymentInterface paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
