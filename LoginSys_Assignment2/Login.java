package LoginSys_Assignment2;

import java.util.Scanner;

public class Login {
    String emailValid = "mohamed@intrast.com";
    String passwordValid = "mohamed123";
    String email;
    String password;
    Scanner scanner = new Scanner(System.in);

    public boolean login() {

        int maxAttempts = 3;
        while (maxAttempts > 0) {
            System.out.print("Enter Email:=> ");
            email = scanner.nextLine();
            System.out.print("Enter Password:=> ");
            password = scanner.nextLine();

            if (email.equals(emailValid) && password.equals(passwordValid)) {
                System.out.println("Login successful");
                return true;
            } else {
                maxAttempts--;
                System.out.println("Incorrect, attempt lefts " + maxAttempts);
            }
        }
        System.out.print("Account Locked. Too many failed attempts");
        return false;
    }

}




