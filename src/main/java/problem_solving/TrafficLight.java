package problem_solving;

public class TrafficLight {

    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public boolean isRed() {
        return color.equals("red");

    }

    public boolean isGreen() {
        return color.equals("green");

    }
    
    public void changeColor(String newClr){
        color = newClr;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    

}
