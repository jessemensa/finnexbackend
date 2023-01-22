package signup.Java;

public class Wallet {
    private int balance = 0; 

    public void viewBalance() {
        System.out.println("Your balance is " + balance); 
    }


    public void deposit(int amount) {
        balance += amount; 
        System.out.println(amount + " has been added to your account. Your new balance is: " + balance);
    }

    public static void main(String[] args) {
        Wallet wallet = new Wallet(); 
        wallet.viewBalance(); 
        wallet.deposit(50); 
        wallet.viewBalance(); 
    }
    
}
