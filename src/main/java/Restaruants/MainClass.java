package Restaruants;

public class MainClass {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
       
        
        restaurant.addItem("chiken fry", 330, 2.0);
         restaurant.addItem("biriyani", 430, 3.0);
          restaurant.addItem("kacci", 530, 5.0);
          
          restaurant.displayMenuList();
          System.out.println( "avarage "+restaurant.calculateAverageRating());
          
          restaurant.removeItem("kacci");
           restaurant.displayMenuList();
        
        

    }

}
