import java.util.Scanner;
public class Ex01SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-4): ");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("You entered One");
                break;
            case 2:
                System.out.println("You entered Two");
                break;
            case 3:
                System.out.println("You entered Three");
                break;
            case 4:
                System.out.println("You entered Four");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 4.");
        }
    }
}