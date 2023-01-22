import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class QRGenerator {
    public static void generateQRCode(String paymentData, String filePath) throws WriterException, IOException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(paymentData, BarcodeFormat.QR_CODE, 350, 350);

        File qrFile = new File(filePath);
        MatrixToImageWriter.writeToStream(bitMatrix, "PNG", new FileOutputStream(qrFile));
    }

    public static void main(String[] args) {
        String paymentData = "Payment of $50 to John Doe's account";
        String filePath = "qr_code.png";
        try {
            generateQRCode(paymentData, filePath);
        } catch (WriterException e) {
            System.out.println("Could not generate QR Code, WriterException :: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Could not generate QR Code, IOException :: " + e.getMessage());
        }
    }
}

