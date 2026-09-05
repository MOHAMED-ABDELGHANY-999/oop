public class Bank__Trasfer extends Payment {
    public Bank__Trasfer(int id, double amount, String date) {
        super(id, amount, date);
    }
    @Override
    public void processPayment() {
        System.out.println("processing Bank Transfer");
        setPaymentStatus("Successful");
    }
}