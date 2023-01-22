import qrcode

def generate_qr_code(payment_data: str, file_path: str):
    qr = qrcode.QRCode(version=1, box_size=10, border=5)
    qr.add_data(payment_data)
    qr.make(fit=True)

    img = qr.make_image(fill_color='black', back_color='white')
    img.save(file_path)

if __name__ == '__main__':
    payment_data = "Payment of $50 to John Doe's account"
    file_path = "qr_code.png"
    generate_qr_code(payment_data, file_path)
    print("QR code saved to qr_code.png")
