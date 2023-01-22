package main

import (
	"fmt"
)

type PaymentService struct {
	amount float64
	qrCode string
}

func (p *PaymentService) setAmount(amount float64) {
	p.amount = amount
}

func (p *PaymentService) setQRCode(qrCode string) {
	p.qrCode = qrCode
}

func (p *PaymentService) Pay() {
	fmt.Println("Scan the QR Code to pay: ", p.amount, ":", p.qrCode)

	var scannedQRCode string
	fmt.Println("Enter the QR Code scanned: ")
	fmt.Scanln(&scannedQRCode)

	if scannedQRCode == p.qrCode {
		fmt.Println("Payment successful!")
	} else {
		fmt.Println("Payment failed!")
	}

}

func main() {
	paymentService := PaymentService{}
	paymentService.setAmount(100.00)
	paymentService.setQRCode("1234567890")
	paymentService.Pay()
}
