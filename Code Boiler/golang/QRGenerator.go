package main

import (
	"fmt"
	"image/png"
	"os"

	qrcode "github.com/skip2/go-qrcode"
)

func main() {
	// Payment details
	payment := "Payment of $50 to John Doe's account"

	// Generate QR code
	qr, err := qrcode.New(payment, qrcode.Medium)
	if err != nil {
		fmt.Println("Error generating QR code:", err)
		return
	}

	// Save QR code to file
	file, err := os.Create("qr_code.png")
	if err != nil {
		fmt.Println("Error creating file:", err)
		return
	}
	defer file.Close()

	if err := png.Encode(file, qr); err != nil {
		fmt.Println("Error encoding QR code:", err)
		return
	}

	fmt.Println("QR code saved to qr_code.png")
}
