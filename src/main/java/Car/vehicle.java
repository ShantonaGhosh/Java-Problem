package Car;

public class vehicle {

    private String make;
    private String model;
    private String year;

    public vehicle(String make, String model, String year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("vehicle info");
        System.out.println(" make " + make);
        System.out.println(" model " + model);
        System.out.println(" year " + year);
    }

}
