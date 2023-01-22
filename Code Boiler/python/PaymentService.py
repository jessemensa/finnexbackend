class PaymentService:
    def __init__(self):
        self.amount = 0
        self.qr_code = ""

    def set_amount(self, amount: float):
        self.amount = amount

    def set_qr_code(self, qr_code: str):
        self.qr_code = qr_code

    def pay(self):
        print(f"Scan the QR Code to pay: {self.amount}:{self.qr_code}")

        scanned_qr_code = input("Enter the QR Code scanned: ")

        if scanned_qr_code == self.qr_code:
            print("Payment successful!")
        else:
            print("Payment failed!")

if __name__ == "__main__":
    payment_service = PaymentService()
    payment_service.set_amount(100.00)
    payment_service.set_qr_code("1234567890")
    payment_service.pay()