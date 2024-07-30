public class BankAccount {
    private static BankAccount instance;
    private AccountDetails accountDetails;

    private BankAccount() {
        accountDetails = new AccountDetails();
    }

    public static BankAccount getInstance() {
        if(instance == null) {
            instance = new BankAccount();
        }
        return instance;
    }

    private class AccountDetails {
        private double balance;

        public void deposit(double amount) {
            balance = balance + amount;
        }

        public void withdraw(double amount) throws FonduriInsuficiente {
            if(amount > balance) {
                throw new FonduriInsuficiente("Fonduri insuficiente");
            }
            balance = balance - amount;
        }

        public double getBalance() {
            return balance;
        }
    }

    public void deposit(double amount) {
        accountDetails.deposit(amount);
    }

    public void withdraw(double amount) {
        try {
            accountDetails.withdraw(amount);
        } catch (FonduriInsuficiente e) {
            System.out.println(e.getMessage());
        }
    }

    public double getBalance() {
        return accountDetails.getBalance();
    }
}
