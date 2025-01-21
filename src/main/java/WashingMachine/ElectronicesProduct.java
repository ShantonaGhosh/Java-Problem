
package WashingMachine;

public class ElectronicesProduct {
    
    private String name;
    private int id;
    private double price;

    public ElectronicesProduct(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }
    
    public void applyDiscount(double disPerchantage){
        double discountPrice=0;
        discountPrice= (price * disPerchantage /100 );
         price -= discountPrice;
        
    }
    
    public double getFinalPrice(){
       return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
