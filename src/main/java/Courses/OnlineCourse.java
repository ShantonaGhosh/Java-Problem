package Courses;

public class OnlineCourse extends Course {

    private String platformName;
    private int duration;

    public OnlineCourse(String name, String instructor, int credit, String platformName, int duration) {
        super(name, instructor, credit);
        this.platformName = platformName;
        this.duration = duration;
    }

    public void courseDetails() {
        super.courseDetails();
        System.out.println("cousre platformName " + platformName);
        System.out.println("cousre duration " + duration);

    }

    public boolean isCourseEligible() {
        return duration >= 10;

    }

}
