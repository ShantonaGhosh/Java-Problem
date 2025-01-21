package problem_solving;

public class Complex {

   private int real;
   private int img;

    public int getReal() {
        return real;
    }

    public void setReal(int real, int real1) {
        this.real = real;
        this.real = real1;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img,int img1) {
        this.img = img;
        this.img=img1;
    }
    int addComplexNumber(int real, int real1,int img,int img1){
        real= real+real1;
        img = img+img1;
        System.out.println("sum is : " + real + " + " +"i" +img );
        return 0;
        
    }

    @Override
    public String toString() {
        return "Complex{" + "real=" + real + ", img=" + img + '}';
    }
   

   
}
