import java.util.Scanner;
class Complex{
    int real;
    int img;
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Complex c1= new Complex();
        Complex c2= new Complex();
        Complex c3= new Complex();

        System.out.println("Enter the real and imaginary of first Complex number: ");
        c1.real=sc.nextInt();
        c1.img=sc.nextInt();
        System.out.println("Enter the real and imaginary of Second Complex number: ");
        c2.real=sc.nextInt();
        c2.img=sc.nextInt();

        c3.real=c2.real+c1.real;
        c3.img=c2.img+c1.img;
      System.out.println("Sum: "+c3.real+ "+" +c3.img+ "i");

    }
}