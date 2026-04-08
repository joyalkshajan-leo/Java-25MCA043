import java.util.*;

class Matrix {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
       int r,c;
        int[][]a = new int[10][10];
        int[][]b = new int[10][10];
        int[][]sum = new int[10][10];
        
System.out.println("Enter the row and column: ");
r=s.nextInt();
c=s.nextInt();

System.out.println("Enter the Values: ");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
a[i][j]=s.nextInt();
}
}

System.out.println("The matrix is: ");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
   System.out.print(a[i][j]+" ");
}
System.out.println();
}
//matrix 2
System.out.println("Enter the row and column of matrix 2: ");
r=s.nextInt();
c=s.nextInt();

System.out.println("Enter the values: ");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){  
b[i][j]=s.nextInt();
}
}
System.out.println("The matrix is: ");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
   System.out.print(b[i][j]+" ");
}
System.out.println();
}

for(int i=0;i<c;i++){
for(int j=0;j<c;j++){
sum[i][j]=a[i][j]+b[i][j];
}}
System.out.println("The sum of the matrix is :");
for(int i=0;i<c;i++){
for(int j=0;j<r;j++){
System.out.println(sum[i][j]);
}
}
System.out.println();
}
}


    
