package Movie;

import java.util.ArrayList;

public class Movie {

    private String title;
    private String director;
    private ArrayList<String> actor;
    private ArrayList<Review> reviews;

     Movie(String title, String director, ArrayList<String> actor) {
        this.title = title;
        this.director = director;
        this.actor = actor;
        this.reviews = new ArrayList<Review>();
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public ArrayList<Review> getReview() {
        return reviews;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public ArrayList<String> getActor() {
        return actor;
    }

}
