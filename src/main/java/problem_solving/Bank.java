package problem_solving;

import java.util.ArrayList;

public class Bank {

    public static ArrayList<Account> accountList = new ArrayList<Account>();

    public void addAccount(Account account) {
        accountList.add(account);
    }

    public void removeAccount(Account account) {
        accountList.remove(account);
    }

    public void depositMoney(Account account, double amount) {
        account.deposite(amount);
    }

    public void withdrawMoney(Account account, double amount) {
        account.widthdraw(amount);

    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }

}
