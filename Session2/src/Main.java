public class Main {
    public static void main(String[] args) {

        SavingsAccount savings =
                new SavingsAccount("11220099", "Mohamed Abdelghany", 10000);

        CurrentAccount current =
                new CurrentAccount("1100111", "Mohamed elatar", 5000);

        savings.deposit(20000);
        savings.deposit(5000, "Salary");

        current.deposit(30000);
        current.deposit(10000, "Business");

        savings.withdraw(40000);
        current.withdraw(7000);

        BankElkhal account1 = savings;
        BankElkhal account2 = current;

        System.out.println(account1);
        System.out.println();

        System.out.println(account2);
        System.out.println();

        System.out.println("Savings Balance: " + account1.getBalance());
        System.out.println("Current Balance: " + account2.getBalance());

        System.out.println("Total Accounts: "
                + BankElkhal.getTotalAccounts());
    }
}