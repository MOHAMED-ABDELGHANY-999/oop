public class Main {
    public static void main(String[] args) {

        Payment payment1 = new Credit_Card(1, 5000, "2026-09-04");
        Payment payment2 = new PayPal(2, 7000, "2026-09-04");
        Payment payment3 = new Bank__Trasfer(3, 1000, "2026-09-04");
        Payment payment4 = new Cash__On__Delivery(4, 3000, "2026-09-04");

        payment1.processPayment();
        payment1.displayPaymentInfo();

        payment2.processPayment();
        payment2.displayPaymentInfo();

        payment3.processPayment();
        payment3.displayPaymentInfo();

        payment4.processPayment();
        payment4.displayPaymentInfo();
    }
}