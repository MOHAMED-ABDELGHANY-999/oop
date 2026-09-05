public class Credit_Card extends Payment {
    public Credit_Card(int id, double amount, String date) {
        super(id, amount, date);
    }
    @Override
    public void processPayment() {
        System.out.println("processing Credit Card");
        setPaymentStatus("Successful");
    }
}