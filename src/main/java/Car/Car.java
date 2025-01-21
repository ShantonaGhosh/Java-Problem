
package Car;


public class Car  extends vehicle {
    private double truckSize;

    public Car(String make, String model, String year,double truckSize) {
        super(make, model, year);
        this.truckSize = truckSize;      
    }
    
    public double getTruckSize(){
        return truckSize;
        
    }
    
    public void displayDetails(){
        super.displayDetails();
        System.out.println(" truck size" + truckSize);
    }
    
    
    
}
