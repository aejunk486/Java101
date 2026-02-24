import java.util.Scanner;
public class ArrayExample1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String student[] = new String[3];
        
       
        for (int i = 0; i < student.length; i++) {
            System.out.print("Input 3 name of person: ");
            student[i] = sc.nextLine();
        }
      
        System.out.println("Student: " + student);
    }
}

