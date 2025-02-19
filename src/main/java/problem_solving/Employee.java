
package problem_solving;

public class Employee {
    private String name;
    private String jobTitle;
    private double salary;
    
    Employee(String name, String jobTitle,double salary){
        this.name=name;
        this.jobTitle=jobTitle;
        this.salary= salary;
       
    }
    
  public double  calculateSalary(double percentage){
      return salary = salary + salary * percentage / 100 ;
              
    }

     public void printEmployeeDetails() {
       
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
   
  
  
  
  
    
}
