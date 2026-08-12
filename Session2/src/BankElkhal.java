public class BankElkhal {

    private final String accountNumber;
    private String owner;
    protected double balance;

    private static int totalAccounts = 0;

    public static final String BANK_NAME = "Bank El Khal";

    public BankElkhal(String accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
        totalAccounts++;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void deposit(double amount, String description) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit: " + amount + " - " + description);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal failed.");
        }
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    @Override
    public String toString() {
        return "Bank: " + BANK_NAME +
                "\nAccount Number: " + accountNumber +
                "\nOwner: " + owner +
                "\nBalance: " + balance;
    }
}