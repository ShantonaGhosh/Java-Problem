package Sorting;

public class BubbleSortAlgorithm {

    public static void printArray(String message, int arr[]) {
        System.out.print(message + " --> ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        int arr[] = {22, 14, 12, 18,9}; 
        //outer loop
        for( int i = 0; i<arr.length-1; i++){
            //inner loop
            for(int j =0; j<arr.length-i-1; j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
           
                printArray("inner loop j :" +j +" i = " + i ,arr);
             
                
            }
              System.out.print("\n");
                printArray("outer loop i :"+ i ,arr);
                System.out.print("\n");
            
        }
         System.out.print("\n");
        printArray("final resul:",arr);
                System.out.print("\n");
        


    }
}
