import secrets 
import sys 


# PURPOSE OF THIS IS FOR USER TO SIGN UP FOR AN ACCOUNT 


class SignUp:
    def __init__(self):
        self.first_name = input("Enter your first name: ")
        self.last_name = input("Enter your last name: ")
        self.email = input("Enter your email: ")
        self.password = input("Enter your password: ")
        self.account_number = self.first_name[0] + self.last_name[0] + secrets.token_hex(4)

    def validate_input(self):
        if not self.email.endswith('@example.com'):
            print("Invalid email address")
            return False
        if len(self.password) < 8:
            print("Password too short")
            return False
        return True

    def register(self):
        if not self.validate_input():
            return
        print("Registration successful! Your account number is: ", self.account_number)
        sys.exit() 

user = SignUp()
user.register()