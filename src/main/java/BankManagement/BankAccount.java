
package BankManagement;

import java.util.ArrayList;


public class BankAccount {
    
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    
    public void deposite(double amount){
        if(amount>0){
        balance +=amount;
        }       
    }
     public void withdraw(int amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }      
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
//check balance------
    public double getBalance() {
        return balance;
    }
     
     
  
    
}
