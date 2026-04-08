import java.util.Scanner;
public class Product{
    int pcode;
    String pname;
    int price;
void read(){
Scanner s=new Scanner(System.in);
System.out.println("Enter the code: ");
pcode=s.nextInt();
System.out.println("Enter the Product name: ");
pname=s.next();
System.out.println("Enter the price of the product: ");
price=s.nextInt();
}
void display(){
    System.out.println("code :" +pcode);
    System.out.println("Product "+pname);
    System.out.println("price"+price);
}
public static void main(String[] args){
    Product p1=new Product();
    p1.read();
    p1.display();

    Product p2=new Product();
    p2.read();
    p2.display();

    Product p3=new Product();
    p3.read();
    p3.display();

System.out.println("The product with lowest price: ");
if(p1.price < p2.price && p1.price < p3.price ){
    p1.display();
}
else if(p2.price < p1.price && p3.price < p2.price){
    p2.display();
}
else {
    p3.display();
}

}
}