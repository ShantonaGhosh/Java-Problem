
package Customer;

public class LoyalCustomer extends Customer{

   
    private double discountRate;

    public LoyalCustomer(String name, String email,double discountRate) {
        super(name, email);
        this.discountRate = discountRate;
    }

  
     public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    private double applyDiscount(double amount){
        return amount - (amount *  discountRate /100);
        
    }
    
    public void addPurchase(double amount){
        double  discountAmount= applyDiscount(amount);
        super.addPurchase(discountAmount);
    }
    
}
