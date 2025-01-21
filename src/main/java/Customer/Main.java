
package Customer;

public class Main {
    public static void main(String[] args){
        
        LoyalCustomer lc = new LoyalCustomer("Santa", "santa@gmail.com",10.0);     
        lc.addPurchase(200);
        lc.addPurchase(300);
           System.out.println(lc.getName()+ " mail" +   lc.calculateTotalPurchase());
        
        Customer c = new Customer("Santa", "santa@gmail.com");
        c.addPurchase(100);
        System.out.println(c.getName()+ " mail" +  c.calculateTotalPurchase());
       
        
        
        
    }
    
}
