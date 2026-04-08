import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        String temp;
        Scanner sc = new Scanner(System.in);
        
      
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
         
        String[] words = new String[size];
        
   
        System.out.println("Enter the strings:");
        for (int i = 0; i < size; i++) {
            words[i] = sc.next();
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) { 
                if (words[j].compareTo(words[j + 1]) > 0) {
                    temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted strings:");
        for (int i = 0; i < size; i++) {
            System.out.println(words[i]);
        }
    }
}