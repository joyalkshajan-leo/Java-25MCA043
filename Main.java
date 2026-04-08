import java.util.*;
class person{
    String name,gender,address;
    int age;
    person(String na,String g ,String a,int ag){
        name =na;
        gender=g;
        address=a;
        age=ag;
    }
}
class Employee extends person{
    int empid,salary;
    String company_name,qualification;

     Employee(String na,String g ,String a,int ag,String c_n,String qual,int eid,int sal){
        super(na,g,a,ag);
        empid=eid;
        company_name=c_n;
        qualification=qual;
        salary=sal;
     }
}

class Teacher extends Employee{
    String subject,deptartment;
    int Teacher_id;

    Teacher(String na,String g ,String a,int ag,String c_n,String qual,int eid,int sal,String dep,int Tid,String sub){
        super(na,g,a,ag,c_n,qual,eid,sal);
        subject=sub;
        deptartment=dep;
        Teacher_id=Tid;
    }
    void display(){
        System.out.println(name + " | " + Teacher_id + " | " + subject + " | " + deptartment);
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Number of Teachers: ");
        int n = sc.nextInt();
        
        Teacher[] t= new Teacher[n];
    
        for(int i=0;i<n;i++){
            System.out.println("\nEnter the details for Teacher"+(i+1));

            System.out.println("Enter Name:");
            String na=sc.next();

            System.out.println("Enter gender:");
            String g=sc.next();

            System.out.println("Enter the address:");
            String a=sc.next();

            System.out.println("Enter the Age:");
            int ag=sc.nextInt();

            System.out.println("Enter Company Name");
            String c_n=sc.next();

            System.out.println("Enter the Qualfication:");
            String qual=sc.next();

            System.out.println("Enter the Employee Id: ");
            int eid=sc.nextInt();
            
            System.out.println("Enter the Salary: ");
            int sal=sc.nextInt();
            
            System.out.println("Enter the Department: ");
            String dep=sc.next();
            
            System.out.println("Enter the Teacher Id: ");
            int Tid=sc.nextInt();
            
            System.out.println("Enter the Subject: ");
            String sub=sc.next();

            t[i]=new Teacher(na, g, a, ag, c_n, qual, eid, sal, dep, Tid, sub);

        }
        System.out.println("\n---Teacher Details---");        
         for(int i=0;i<n;i++){
            t[i].display();
         }
    }
}