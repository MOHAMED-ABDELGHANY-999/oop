public class PayPal extends Payment {
    public PayPal(int id, double amount, String date) {
        super(id, amount, date);
    }
    @Override
    public void processPayment() {
        System.out.println("processing PayPal");
        setPaymentStatus("Successful");
    }
}