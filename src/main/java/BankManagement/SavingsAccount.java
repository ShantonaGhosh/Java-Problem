package BankManagement;

public class SavingsAccount extends BankAccount {

    private double interestRate;
    public SavingsAccount(int accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest(){
        double interest = getBalance() * (interestRate /100);
        deposite(interest);
     System.out.println("Interest of " + interest + " applied.");
    }
}
