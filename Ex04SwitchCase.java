import java.util.Scanner;
public class Ex04SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (0-3) ");
        int num = scanner.nextInt(); 
        switch (num) {
            case 0 -> System.out.println("Zero");
            case 1 -> System.out.println("One");   
            case 2 -> System.out.println("Two");  
            case 3 -> System.out.println("Three");  
            default -> System.out.println("out of bound");
        };
    }
}
