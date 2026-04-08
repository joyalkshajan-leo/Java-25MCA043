import java.util.Scanner;
public class cpu{
    int price;
    class processor{
        int no_of_cores;
        String manufactrer;
    
    void read()
        {  
        Scanner s=new Scanner(System.in);   
        
        System.out.println("Enter the price");
        price=s.nextInt();
        System.out.println("Enter the no of core:");
         no_of_cores=s.nextInt();
       
        System.out.println("Enter the manufacturer");
         manufactrer=s.next();
        }

        void display()
        {
            System.out.println("---------------");
            System.out.println(price);
            System.out.println(no_of_cores);
            System.out.println(manufactrer);
           
        }}


        public static void main(String[] args){
            cpu cpu1=new cpu();
            cpu.processor p1= cpu1.new processor();
            cpu.Ram ram1=new cpu.Ram();

            p1.read();
            p1.display();
            ram1.readRam();
            ram1.displayRam();
            
            

            }
            static class Ram{
            int memory;
            String manu;
            

             
        void readRam()    
        {  
        
        Scanner s=new Scanner(System.in);   
        
        System.out.println("Enter the RAM memory");
        memory=s.nextInt();
        System.out.println("Enter the RAM manufacturer:");
         manu=s.next();

        }
        void displayRam()
        {
            System.out.println("----------");
            System.out.println(memory);
            System.out.println(manu);



    }}
} 