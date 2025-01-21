package Movie;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieMain {

    public static void main(String[] args) {
        System.out.print("000");

        Movie movie = new Movie("Titanic", "james Cameron", new ArrayList(Arrays.asList("shereaya", "arnab")));

        Review review1 = new Review("Great Movie", "irvin", 4.9);
        Review review2 = new Review("Great Movie2", "irvin00", 3.9);
        Review review3 = new Review("Great Movie3", "irvi33n", 2.9);
        movie.addReview(review1);
        movie.addReview(review2);
        movie.addReview(review3);

         System.out.println(movie.getTitle());
         for(Review r : movie.getReview() ){
                System.out.println(r.getReviewText() + " by" + r.getReviewName()+ " "+ r.getRating());
         }
        
        Movie movie1 = new Movie("idol", "ddhh", new ArrayList(Arrays.asList("yyyyy", "uiuii")));

        movie1.addReview(review1);
        movie1.addReview(review2);
        movie1.addReview(review3);
         System.out.println(movie1.getTitle());
         for(Review r : movie1.getReview() ){
                System.out.println(r.getReviewText() + " by" + r.getReviewName()+ " "+ r.getRating());
         }
    }

}
