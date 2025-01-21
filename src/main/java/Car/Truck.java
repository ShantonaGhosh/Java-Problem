
package Car;

public class Truck  extends vehicle{
  
   private double payLoadCapacity;

    public Truck(String make, String model, String year,double payLoadCapacity) {
        super(make, model, year);
        this.payLoadCapacity = payLoadCapacity;
    }
    
      
    public void displayDetails(){
        super.displayDetails();
        System.out.println(" payLoad Capacity" + payLoadCapacity);
    }
    
   
    
}
