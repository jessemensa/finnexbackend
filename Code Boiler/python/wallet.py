# WALLET PLATFORM - PYTHON 


class Wallet: 
    def __init__(self, balance):
        self.balance = 0 

    def view_balance(self):
        print("Your balance is: ", self.balance) 


    def deposit(self, amount): 
        self.balance += amount
        print(f"{amount} has been added to your account. Your new balance is: {self.balance}")

wallet = Wallet() 
wallet.view_balance() 
wallet.add_money(50) 
wallet.view_balance()  