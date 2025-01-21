
package Courses;

public class CourseManagement {
    
    public static void main(String[] args){
        
        OnlineCourse oc=new OnlineCourse("java", "anisul islam", 10,"onlineAcadamy",9);
        oc.courseDetails();
        if(oc.isCourseEligible()){
            System.out.println("eligible");
        }else{
            System.out.println("not eligible");
        }
          
        
    }
    
}
