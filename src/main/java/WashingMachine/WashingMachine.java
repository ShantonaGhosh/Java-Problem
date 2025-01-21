package WashingMachine;

public class WashingMachine extends ElectronicesProduct {

    private int warrantyPeriod;

    public WashingMachine(String name, int id, double price, int warrantyPeriod) {
        super(name, id, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    public void extendsWarranty(int extendDate) {
        warrantyPeriod += extendDate;
                System.out.println("Discount applied to Washing Machine: " + getName() +" warrantyPeriod "+warrantyPeriod );

    }

    public void applyDiscount(double discountAmount) {
        super.applyDiscount(discountAmount);
        System.out.println("Discount applied to Washing Machine: " + getName() +" discountAmount "+discountAmount );

    }

}
