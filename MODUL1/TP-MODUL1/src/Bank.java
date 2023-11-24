import java.util.ArrayList;

public class Bank {
    // TODO: Create Accounts ArrayList to Store Bank Account from Account Class
    private ArrayList<Account> accounts = new ArrayList<Account>();

    // TODO: Create a method to add an account to the ArrayList.
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // TODO: Create Method to remove Account
    public void removeAccount(int accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber() == accountNumber) {
                System.out.println("\nAkun "+accounts.get(i).getName()+" Berhasil Dihapus!");
                accounts.remove(i);
                break;
            }
        }
    }

    // TODO: Create a return method to retrieve an account by its account number
    public Account getAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    // TODO: Create a return method to retrieve a copy of all accounts from the list
    public ArrayList<Account> getAllAccounts() {
        return accounts;
    }
}