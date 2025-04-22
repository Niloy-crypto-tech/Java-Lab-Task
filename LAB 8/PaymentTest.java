interface PaymentMethod {
    boolean authorizePayment(double amount);
    void processPayment(double amount);
    void refundPayment(double amount);
}
// CreditCard.java
class CreditCard implements PaymentMethod {
    private String cardNumber;
    private String cardHolderName;

    public CreditCard(String c, String s) {
        this.cardNumber = c;
        this.cardHolderName = s;
    }

    @Override
    public boolean authorizePayment(double amount) {
        if (cardNumber != null && cardNumber.length() == 16) {
            System.out.println(" authorization successful");
            return true;
        } else {
            System.out.println(" authorization failed");
            return false;
        }
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Credit Card processed: " + amount + " tk");
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Credit Card refunded: " + amount + " tk");
    }
}
// PayPal.java
class PayPal implements PaymentMethod {
    private String email;
    private String password;

    public PayPal(String mail, String pass) {
        this.email = mail;
        this.password = pass;
    }

    @Override
    public boolean authorizePayment(double amount) {
        if (email != null && email.contains("@") && password != null && !password.isEmpty()) {
            System.out.println(" authorization successful.");
            return true;
        }
        System.out.println("authorization failed.");
        return false;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal processed: " + amount + " tk");
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("PayPal refunded: " + amount + " tk");
    }
}
// PaymentTest.java
public class PaymentTest {
    public static void main(String[] args) {
        PaymentMethod c = new CreditCard("4234567890123456", "Niloy");
        PaymentMethod p = new PayPal("niloy@example.com", "DingDongDing");

        System.out.println("Credit Card Payment ");
        c.authorizePayment(10000);
        c.processPayment(5000);
        c.refundPayment(2000);


        System.out.println("\n PayPal Payment ");
        p.authorizePayment(5000);
        p.processPayment(10000);
        p.refundPayment(3000);
    }
}

