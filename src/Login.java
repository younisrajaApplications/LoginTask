import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String correctUsername = "Admin";
        String correctPassword = "Password";
        System.out.print("Please enter your username: ");
        String usernameInput = scan.nextLine();
        System.out.print("Please enter your password: ");
        String passwordInput = scan.nextLine();
        System.out.println((correctUsername.equals(usernameInput) && correctPassword.equals(passwordInput)) ? "Access Granted!" : "Access Denied!");
    }
}