    public class Account {
        // TODO: Create Private Attributes for Name, Account Number and Balance, then create a setter and getter method for each attributes
        private String name;
        private int accountNumber;
        private double balance;

        public Account(String name, int accountNumber, double balance) {
            this.name = name;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public String getName() {
            return name;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

    // TODO: Create a deposit method
    public void deposit(double amount) {
        balance += amount;
    }
    
    // TODO: Create a withdraw method
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}