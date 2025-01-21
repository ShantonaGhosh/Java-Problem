package Array;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();

        int[] dataList = new int[n];

        //input
        for (int i = 0; i < n; i++) {
            dataList[i] = sc.nextInt();
        }

        //output
        for (int i = 0; i < n; i++) {
            System.out.println("output : " + dataList[i]);
        }

        //search
        System.out.print("enter x value : ");
        int x = sc.nextInt();
        for (int i = 0; i < dataList.length; i++) {
            if (dataList[i] == i) {
                System.out.println(" x found at index : " + i);
            }
        }

        //2d array
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] list = new int[rows][cols];

        //input row
        for (int i = 0; i < rows; i++) {
            //col
            for (int j = 0; j < cols; j++) {
                list[i][j] = sc.nextInt();
            }
        }
        //output
        for (int i = 0; i < rows; i++) {
            //col
            for (int j = 0; j < cols; j++) {
                System.out.println("output " + list[i][j] + " ");

            }
        }

        //search
        System.out.print("enter y value : ");
        int y = sc.nextInt();
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < cols; j++) {
                if (list[i][j] == i) {
                    System.out.println(" x found at index : (" + i + " , " + j + " )");
                }
            }

        }

    }

}
