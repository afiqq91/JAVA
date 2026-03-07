import java.util.Scanner;

public class LoginAttemptsExcercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int loginAttempts = 0;

        while (loginAttempts <= 3) {

            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            // Example correct credentials
            if (username.equals("admin") && password.equals("1234")) {
                System.out.println("Login successful!");
                break;
            } 
            else {

                if (loginAttempts < 3) {
                    loginAttempts++;
                    System.out.println("Invalid credentials. Try again.");
                    System.out.println("Login attempts: " + loginAttempts);
                } 
                else if (loginAttempts == 3) {
                    System.out.println("Too many login attempts. Please try again later.");
                    loginAttempts++;
                } 
                else {
                    System.out.println("Account locked. Please contact support.");
                    break;
                }
            }
        }

        scanner.close();
    }
}
