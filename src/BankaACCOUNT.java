public class BankaACCOUNT {

    private static int totalAccounts = 0;
    private final String accountNumber;
    private String accountHolder;
    private double balance;
    private String accountType;

    public BankaACCOUNT(String accountNumber, String accountHolder, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
        totalAccounts++;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

    public void withdraw(double amount, String withdrawalType) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " for " + withdrawalType + " successful.");
        } else {
            System.out.println("Insufficient balance. Withdrawal for " + withdrawalType + " failed.");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void main(String[] args) {
        BankaACCOUNT account1 = new BankaACCOUNT("BA1234", "John Doe", 500.0, "Savings");

        account1.deposit(100.0);
        account1.withdraw(50.0);
        account1.withdraw(700.0);

        System.out.println("Total number of bank accounts created: " + BankaACCOUNT.getTotalAccounts());
    }
}
