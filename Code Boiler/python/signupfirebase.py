import firebase_admin
from firebase_admin import auth

cred = credentials.Certificate("path/to/serviceAccountKey.json")
firebase_admin.initialize_app(cred)

class SignUp:
    def __init__(self):
        self.email = input("Enter your email: ")
        self.password = input("Enter your password: ")
        self.phone_number = input("Enter your phone number: "); 
        self.address = input("Enter your address: "); 
    
    def register(self):
        if not self.validate_input():
            return
        try:
            user = auth.create_user(
                email=self.email, 
                password=self.password, 
                phone_number = self.phone_number, 
                address = self.address)
            print(f"Successfully created user with uid: {user.uid}")
        except auth.AuthError as e:
            print(e)