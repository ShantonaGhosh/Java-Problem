
package Function;

import java.util.Scanner;


public class Factorial {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();
        printFactorial(n);
        
    }
    public static void printFactorial(int n){
        if(n<0){
            System.out.print("Invalid Number");
            return;
        }
        
        int fact=1;
        for(int i =n; i>=1; i--){
            fact = fact *i;
        }

}

}

