package problem_solving;


import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Employees {

    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employees(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public int giveYearOfService() {
        return Period.between(hireDate, LocalDate.now()).getYears();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employees{");
        sb.append("name=").append(name);
        sb.append(", salary=").append(salary);
        sb.append(", hireDate=").append(hireDate);
        sb.append('}');
        return sb.toString();
    }


}
