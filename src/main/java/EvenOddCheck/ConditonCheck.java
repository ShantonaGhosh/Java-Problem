
package EvenOddCheck;

import java.util.Scanner;


public class ConditonCheck {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        if (number %2==0) {
            System.out.print(" Even Number ");

        } else {
            System.out.print(" Odd Number");

        }
    }
    
}
