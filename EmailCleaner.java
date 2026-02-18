import java.util.Scanner;

public class EmailCleaner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        // 1) trim() 
        email = email.trim();

        // 2) replace() 
        email = email.replace(" ", "");

        // 3) contains() 
        if (!email.contains("@")) {
            System.out.println("Invalid email: missing @");
            return;
        }

        // 4) substring() 
        int atIndex = email.indexOf("@");

        String username = email.substring(0, atIndex);
        String domain = email.substring(atIndex + 1);

        // output
        System.out.println("\nCleaned Email");
        System.out.println("Username: " + username);
        System.out.println("Domain  : " + domain);
        System.out.println("Full    : " + email);

        sc.close();
    }
}