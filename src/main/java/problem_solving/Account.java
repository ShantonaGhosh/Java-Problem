package problem_solving;

public class Account {

    private String name;
    private int accountNumber;
    private double balance;

    public Account(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    
    public void deposite(double amount){
         balance +=amount;
        
    }
    public void widthdraw(double amount){
        balance -=amount;
    }

   
    public String getAccountInfo() {
        return "name=" + name + ", accountNumber=" + accountNumber + ", balance=" + balance + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    

}
