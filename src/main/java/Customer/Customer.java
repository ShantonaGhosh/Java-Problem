package Customer;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private String email;
    private List<Double> purchaseHistory;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.purchaseHistory = new ArrayList<Double>();
    }

    public void addPurchase(double amount) {
        purchaseHistory.add(amount);

    }

    public double calculateTotalPurchase() {
        double total = 0;
        for (double a : purchaseHistory) {
            total += a;

        }
        return total;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   

  
    

}
