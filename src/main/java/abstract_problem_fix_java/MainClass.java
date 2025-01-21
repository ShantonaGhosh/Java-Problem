
package abstract_problem_fix_java;


public class MainClass {
    
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("print :  ");
//        int n = sc.nextInt();
   Shape rectangle = new Rectangle(10,12);
   Shape circle = new Circle(5);
   Shape triangle = new Triangle(7,8,9);
   
   System.out.println("rectangle.getArea :  " +rectangle.getArea());
    System.out.println("rectangle.getArea :  " +rectangle.getPerimeter());
     System.out.println("circle.getArea :  " +circle.getArea() );
        System.out.println("circle.getArea :  " +circle.getPerimeter());
   
           System.out.println("triangle.getArea :  " +triangle.getArea() );
        System.out.println("rectangtrianglele.getArea :  " +triangle.getPerimeter());
   
   
       
    }
    
    

   
   
   
   
    
    
}
