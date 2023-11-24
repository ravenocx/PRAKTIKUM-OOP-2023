import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // TODO: Create an Account object and initialize its account number and balance.
        Account account1 = new Account("Aldean", 1202200777,100000 );

        Account account2 = new Account("Tegar", 1202200888,200000 );

        Account account3 = new Account("Gemilang", 1202200999, 300000);

        // TODO: Create bank object
        Bank bank = new Bank();

        // TODO: Add account to bank
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        // TODO: Show balance for each account
        System.out.println("Saldo Akun "+ account1.getName()+": " + account1.getBalance());
        System.out.println("Saldo Akun "+ account2.getName()+": " + account2.getBalance());
        System.out.println("Saldo Akun "+ account3.getName()+": " + account3.getBalance());

        // TODO: Deposit and withdraw account
        account1.deposit(50000.0);
        account2.withdraw(20000.0);

        // TODO: Show Balance after deposit or withdraw
        System.out.println("\nSaldo Akun "+ account1.getName()+" setelah menyetor: " + account1.getBalance());
        System.out.println("Saldo Akun "+ account2.getName()+" setelah menarik uang: " + account2.getBalance());

        // TODO: Remove account
        bank.removeAccount(1202200888);

        // TODO: Show all account in bank
        ArrayList<Account> allAccounts = bank.getAllAccounts();
        System.out.println("\nDaftar Semua Akun dalam Bank:");
        for (Account account : allAccounts) {
            System.out.println("Nama: "+ account.getName()+", Nomor Akun: " + account.getAccountNumber() + ", Saldo: " + account.getBalance());
        }
    }
}