package signup.Java;

import java.util.Scanner; 
import java.security.SecureRandom; 


class SignUp {
    private String firstName; 
    private String lastName; 
    private String email; 
    private String password; 
    private String accountNumber; 



    public SignUp() {
        Scanner input = new Scanner(System.in); 


        System.out.print("Enter your first name: "); 
        firstName = input.nextLine(); 
        System.out.print("Enter your last name: "); 
        lastName = input.nextLine(); 
        System.out.print("Enter your email: "); 
        email = input.nextLine(); 
        System.out.print("Enter your password: "); 
        password = input.nextLine(); 

        SecureRandom random = new SecureRandom(); 

        accountNumber = firstName.substring(0, 1) + lastName.substring(0, 1) + Integer.toHexString(random.nextInt()); 
    }


    private boolean validateInput() {
        if (!email.endsWith("@example.com")) {
            System.out.println("Invalid email address"); 
            return false; 
        }
        if (password.length() < 8) {
            System.out.println("Password is short"); 
            return false; 
        }
        return true; 
    }

    public void register() {
        if (!validateInput()) {
            return; 
        }
        System.out.println("Registeration successful! Your account number is " + accountNumber);
        System.exit(0); 
    }

    public static void main(String[] args) {
        SignUp user = new SignUp(); 
        user.register(); 
    }
}


