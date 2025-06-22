package learningProgramSolutions.AdapterPatternExample;

public class Test {
    public static void main(String[] args) {

        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPalGateway());
        paypalProcessor.processPayment(250.75);


        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());
        stripeProcessor.processPayment(499.99);
    }
}
