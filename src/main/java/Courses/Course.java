
package Courses;


public class Course {
    private String name;
    private String instructor;
    private int credit;

    public Course(String name, String instructor, int credit) {
        this.name = name;
        this.instructor = instructor;
        this.credit = credit;
    }
    
    public void courseDetails(){
        System.out.println("cousre name " + name);
        System.out.println("cousre instructor " + instructor);
        System.out.println("cousre credit " + credit);
    }
    
    
}
