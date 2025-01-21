package EvenOddCheck;

import java.util.Scanner;

public class CheckEvenOrOddNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.print(" Even Number ");

        } else {
            System.out.print(" Odd Number");

        }
    }

}
