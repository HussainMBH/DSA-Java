public class try1 {

    static class BankAccount {
        private String accountNumber;
        private String accountHolderName;
        private double balance;

        public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = initialBalance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public String getAccountHolderName() {
            return accountHolderName;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }

        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: $" + amount);
            } else {
                System.out.println("Insufficient balance!");
            }
        }

        public void displayAccountInfo() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: $" + balance);
        }
    }

    public class Main {
        public static void main(String[] args) {
            // Create a bank account object
            BankAccount account = new BankAccount("1234567890", "John Doe", 1000.0);

            // Display initial account info
            account.displayAccountInfo();

            // Perform some transactions (you can modify these for testing)
            account.deposit(500);
            account.withdraw(200);

            // Display updated account info
            account.displayAccountInfo();
        }
    }

}
