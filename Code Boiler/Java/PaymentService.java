package signup.Java;
import java.util.Scanner; 

public class PaymentService {
    private double amount; 
    private String qrCode; 


    public PaymentService() {
        this.amount = 0; 
        this.qrCode = ""; 
    }

    public void setAmount(double amount) {
        this.amount = amount; 
    }

    public void setQRCode(String qrCode) {
        this.qrCode = qrCode; 
    }

    public void pay() {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Scan the QR Code to pay: " + this.amount + ":" + this.qrCode);
        System.out.println("Enter the QR Code scanned: "); 
        String scannedQRCode = scanner.nextLine();

        if (scannedQRCode.equals(this.qrCode)) {
            System.out.println("Payment successful!"); 
        } else {
            System.out.println("Payment failed!");
        }
        scanner.close(); 
    }
}


class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.setAmount(20.50);
        paymentService.setQRCode("123456");
        paymentService.pay();
    }
}
