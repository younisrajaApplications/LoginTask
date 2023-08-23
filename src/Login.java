import java.util.Scanner;

/**
 * Login screen
 * {@code @Author} Younis Mubashar Raja
 * {@code @Version} 22/08/2023
 */
public class Login {
    /**
     * Takes in user input for username and password and
     * checks against the correct details
     * @param args For the main method
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //2D Array to store details
        String[][] userDetails = {{"username1","username2","username3","username4","username5"},{"password1","password2","password3","password4","password5"}};
        byte attempts = 0;
        boolean correctDetails = false;
        do {
            attempts++;
            System.out.print("Please enter your username: ");
            String usernameInput = scan.nextLine();
            System.out.print("Please enter your password: ");
            String passwordInput = scan.nextLine();
            for (int i = 0; i < userDetails[0].length; i++) {
                if (usernameInput.equalsIgnoreCase(userDetails[0][i])) {
                    if (passwordInput.equalsIgnoreCase(userDetails[1][i])) {
                        correctDetails = true;
                    }
                }
                if (!correctDetails && attempts < 3) {
                    System.out.println("Please try again.");
                    break;
                }
            }
        } while (attempts < 3 && !correctDetails);
        System.out.println((correctDetails) ? "Access Granted!" : "Access Denied!");
    }
}