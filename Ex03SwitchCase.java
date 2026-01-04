import java.util.Scanner;
public class Ex03SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (0-5) ");
        int num = scanner.nextInt();
        switch (num) {
            case 0:
                System.out.println("Zero");
                
            case 1:
                System.out.println("One");
              
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;           
            default:
                System.out.println("Invalid input! Please enter a number between 0 and 9.");
        }
        scanner.close();
    }
}