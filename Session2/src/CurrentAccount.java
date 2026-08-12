public class CurrentAccount extends BankElkhal {
    private static final double OVERDRAFT_LIMIT = 1000;

    public CurrentAccount(String accountNumber, String owner, double balance) {
        super(accountNumber, owner, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance + OVERDRAFT_LIMIT) {
            balance -= amount;
            System.out.println("Current Account withdrawal successful.");
        } else {
            System.out.println("Current Account: Withdrawal exceeds overdraft limit.");
        }
    }

    @Override
    public String toString() {
        return "Current Account\n" + super.toString();
    }
}