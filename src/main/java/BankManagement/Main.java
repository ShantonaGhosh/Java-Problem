
package BankManagement;

public class Main {
    public static void main(String[] args){
        SavingsAccount sa1 = new SavingsAccount(03,"santa",3000,10.0);
        SavingsAccount sa2 = new SavingsAccount(04,"santa",5000,20.0);
        SavingsAccount sa3 = new SavingsAccount(05,"santa",8000,15.0);
        sa1.deposite(1000);
        System.out.println(" balance "+sa1.getBalance());
        sa1.applyInterest();
        
        
    }
    
}
