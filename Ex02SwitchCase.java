import java.util.Scanner;
public class Ex02SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day of the week (Sunday to Saturday): ");
        String day = scanner.nextLine();
        switch (day) {
            case "Sunday":System.out.println("It's Sunday, time to relax!"); break;
            case "Monday":System.out.println("It's Monday, back to work!"); break;  
            case "Tuesday":System.out.println("It's Tuesday, keep going!"); break;
            case "Wednesday":System.out.println("It's Wednesday, halfway there!"); break;
            case "Thursday":System.out.println("It's Thursday, almost the weekend!"); break;
            case "Friday":System.out.println("It's Friday, the weekend is near!"); break;
            case "Saturday":System.out.println("It's Saturday, enjoy your day!");break;
            default:System.out.println("Invalid day entered."); break;
        }
        scanner.close();
    }
}