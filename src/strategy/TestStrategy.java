package strategy;

public class TestStrategy {
    public static void main(String[] args) {
        MonthlySubscription userSubscription =
                new MonthlySubscription(100, "John123");
        userSubscription.setPaymentMethod(new PayPalService());
        userSubscription.pay();
    }
}
