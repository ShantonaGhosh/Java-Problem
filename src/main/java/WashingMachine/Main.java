
package WashingMachine;

public class Main {
    public static void main(String[] args){
        ElectronicesProduct ep = new ElectronicesProduct("ES2",01,1000);
        ep.applyDiscount(10);
        ep.getFinalPrice();
        WashingMachine wm = new WashingMachine("w232",02,800,24);
        wm.applyDiscount(10);
        wm.extendsWarranty(12);
        System.out.println("Price after discount: $" + wm.getFinalPrice());
        
        
    }
    
}
