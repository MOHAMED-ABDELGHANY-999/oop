public class SavingsAccount extends BankElkhal {
    public SavingsAccount(String accountNumber, String owner, double balance) {
        super(accountNumber, owner, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Savings withdrawal successful.");
        } else {
            System.out.println("Savings Account: Insufficient balance.");
        }
    }

    @Override
    public String toString() {
        return "Savings Account\n" + super.toString();
    }
}