public abstract class Payment {
    private int id;
    private double amount;
    private String date;
    private String paymentStatus;

    public Payment(int id, double amount, String date) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.paymentStatus = "Pending";
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public abstract void processPayment();

    public void displayPaymentInfo() {
        System.out.println("Payment ID: " + id);
        System.out.println("Amount: " + amount);
        System.out.println("Payment Date: " + date);
        System.out.println("Payment Status: " + paymentStatus);
    }
}