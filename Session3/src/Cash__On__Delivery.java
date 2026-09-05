public class Cash__On__Delivery extends Payment {
    public Cash__On__Delivery(int id, double amount, String date) {
        super(id, amount, date);
    }
    @Override
    public void processPayment() {
        System.out.println("processing Cash on Delivery");
        setPaymentStatus("Successful");
    }
}