package learningProgramSolutions.AdapterPatternExample;

public class StripeGateway {
    public void makeStripePayment(double amountInDollars) {
        System.out.println("Payment of $" + amountInDollars + " processed through Stripe.");
    }
}
